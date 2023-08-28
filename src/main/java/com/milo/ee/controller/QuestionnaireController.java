package com.milo.ee.controller;

import com.milo.ee.EeApplication;
import com.milo.ee.model.question.Question;
import com.milo.ee.service.QuestionService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

@RestController
@RequestMapping("/questionnaire")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class QuestionnaireController {

    @Autowired
    private QuestionService service;

    @GetMapping("/hello")
    public ResponseEntity<?> sayHi() {
        return new ResponseEntity<>("La aplicación está funcionando correctamente! :D", HttpStatus.OK);
    }

    @PostMapping("/document-xls")
    public void returnWorkbookAsExcelFile(HttpServletResponse response, @RequestBody ArrayList<Question> questions) throws IOException {

//        File to return
        Workbook workbook = new com.milo.ee.model.question.workbook.Workbook().getWorkbook();

        service.saveQuestions(workbook, questions);

//        configuring response with file to return
        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        response.setHeader("Content-Disposition", "attachment; filename=data.xls");
        workbook.write(response.getOutputStream());
        workbook.close();
    }

    @PostMapping("/document-csv/{fileName}")
    public void returnWorkbookAsCSVFile(HttpServletResponse response, @RequestBody ArrayList<Question> questions,@PathVariable String fileName) {

//        Create csv file, including first question
        Workbook workbook = new com.milo.ee.model.question.workbook.Workbook().getWorkbook();

//        save questions from the Array to the workbook
        service.saveQuestions(workbook, questions);

//        The file that will be returned
        StringBuilder csvToGenerate = new StringBuilder();

        Sheet sheet = workbook.getSheetAt(0); // IST REQUIRED CREATE A SHEET

        //Iterate each row
        for (Row row : sheet) {

            // Iterate each cell of the rows
            for (Cell cell : row) {

                // Obtain the value of a cell as a String and add it to the StringBuilder
                csvToGenerate.append(cell.getStringCellValue().replaceAll(",",".").replaceAll("\n","  ")).append(",");
            }

            // add new empty line to separate the rows
            csvToGenerate.append("\n");
        }

        // Configure the HTTP response
        response.setContentType("text/csv");
        response.setHeader("Content-Disposition", "attachment; filename=\"document.csv\"");

        try {
            // Obtain the output flow of the HTTP response
            OutputStream outputStream = response.getOutputStream();

            // Write the CSV data into the output flow
            outputStream.write(csvToGenerate.toString().getBytes());
            outputStream.flush();
            outputStream.close();

            service.consoleReportOfExam(fileName);

        } catch (IOException e) {

            final Log Logger = LogFactory.getLog(EeApplication.class);

            Logger.error("Something went wrong trying downloading the file");

            e.printStackTrace();
        }

    }


}
