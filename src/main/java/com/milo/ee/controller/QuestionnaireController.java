package com.milo.ee.controller;

import com.milo.ee.model.question.Question;
import com.milo.ee.service.QuestionService;
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

    @PostMapping("/document-csv")
    public void returnWorkbookAsCSVFile(HttpServletResponse response, @RequestBody ArrayList<Question> questions) {

        Workbook workbook = new com.milo.ee.model.question.workbook.Workbook().getWorkbook();

        service.saveQuestions(workbook, questions);

        StringBuilder csv = new StringBuilder();

        Sheet sheet = workbook.getSheetAt(0);

        //Iterate each row
        for (Row row : sheet) {

            // Iterate each cell of the rows
            for (Cell cell : row) {

                // obtain the value of a cell as a String and add it to the StringBuilder
                csv.append(cell.getStringCellValue()).append(";");
            }
            // add new empty line to separate the rows
            csv.append("\n");
        }

        // Configure the HTTP response
        response.setContentType("text/csv");
        response.setHeader("Content-Disposition", "attachment; filename=\"document.csv\"");

        try {
            // Obtain the output flow of the HTTP response
            OutputStream outputStream = response.getOutputStream();

            // Write the CSV data into the output flow Escribir los datos CSV en el flujo de salida
            outputStream.write(csv.toString().getBytes());
            outputStream.flush();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
