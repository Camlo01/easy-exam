package com.milo.ee.controller;

import com.milo.ee.model.question.Question;
import com.milo.ee.service.QuestionService;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@RestController
@RequestMapping("/questionnaire")
@CrossOrigin(origins = "*", methods = {RequestMethod.POST})
public class QuestionnaireController {

    @Autowired
    private QuestionService service;

    @PostMapping("/document-xls")
    public void returnWorkbookAsExcelFile(HttpServletResponse response, @RequestBody ArrayList<Question> questions) throws IOException {
        System.out.println("execute /document-xls path");

//        File to return
        Workbook workbook = new com.milo.ee.model.question.workbook.Workbook().getWorkbook();
        System.out.println(questions.size());

        service.saveQuestions(workbook, questions);

//        configuring response with file to return
        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        response.setHeader("Content-Disposition", "attachment; filename=data.xls");
        workbook.write(response.getOutputStream());
        workbook.close();
    }

    @PostMapping("/document-csv")
    public void returnWorkbookAsCSVFile(HttpServletResponse response, @RequestBody ArrayList<Question> questions) {
        throw new UnsupportedOperationException("Method not yet implemented!");
    }


}
