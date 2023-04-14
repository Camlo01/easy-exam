package com.milo.ee.model.question.workbook;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

/**
 * Workbook class that simulate an Excel file
 * @author Milo
 */
public class Workbook {

    private final org.apache.poi.ss.usermodel.Workbook workbook;

    public Workbook() {
        workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet("exam");
        setFields(sheet);
    }

    /**
     * Method in charge of return the object ready with values initialized
     * @return workbook
     */
    public org.apache.poi.ss.usermodel.Workbook getWorkbook() {
        return workbook;
    }

    /**
     * Method in charge of config the fields in the Excel document
     *
     * @param sheet page to set values
     */
    private void setFields(Sheet sheet) {
        Row firstRow = sheet.createRow(0);

        Cell cellQuestionText = firstRow.createCell(0);
        cellQuestionText.setCellValue("QuestionText");

        Cell cellQuestionType = firstRow.createCell(1);
        cellQuestionType.setCellValue("QuestionType");

        Cell cellAnswer1 = firstRow.createCell(2);
        cellAnswer1.setCellValue("Answer1");

        Cell cellIsAnswer1Correct = firstRow.createCell(3);
        cellIsAnswer1Correct.setCellValue("IsAnswer1Correct");

        Cell cellAnswer2 = firstRow.createCell(4);
        cellAnswer2.setCellValue("Answer2");

        Cell cellIsAnswer2Correct = firstRow.createCell(5);
        cellIsAnswer2Correct.setCellValue("IsAnswer2Correct");

        Cell cellAnswer3 = firstRow.createCell(6);
        cellAnswer3.setCellValue("Answer3");

        Cell cellIsAnswer3Correct = firstRow.createCell(7);
        cellIsAnswer3Correct.setCellValue("IsAnswer3Correct");

        Cell cellAnswer4 = firstRow.createCell(8);
        cellAnswer4.setCellValue("Answer4");

        Cell cellIsAnswer4Correct = firstRow.createCell(9);
        cellIsAnswer4Correct.setCellValue("IsAnswer4Correct");

        Cell cellAnswer5 = firstRow.createCell(10);
        cellAnswer5.setCellValue("Answer5");

        Cell cellIsAnswer5Correct = firstRow.createCell(11);
        cellIsAnswer5Correct.setCellValue("IsAnswer5Correct");

        Cell cellAnswer6 = firstRow.createCell(12);
        cellAnswer6.setCellValue("Answer6");

        Cell cellIsAnswer6Correct = firstRow.createCell(13);
        cellIsAnswer6Correct.setCellValue("IsAnswer6Correct");

        Cell cellAnswer7 = firstRow.createCell(14);
        cellAnswer7.setCellValue("Answer7");

        Cell cellIsAnswer7Correct = firstRow.createCell(15);
        cellIsAnswer7Correct.setCellValue("IsAnswer7Correct");

        Cell cellAnswer8 = firstRow.createCell(16);
        cellAnswer8.setCellValue("Answer8");

        Cell cellIsAnswer8Correct = firstRow.createCell(17);
        cellIsAnswer8Correct.setCellValue("IsAnswer8Correct");

        Cell cellAnswer9 = firstRow.createCell(18);
        cellAnswer9.setCellValue("Answer9");

        Cell cellIsAnswer9Correct = firstRow.createCell(19);
        cellIsAnswer9Correct.setCellValue("IsAnswer9Correct");

        Cell cellAnswer10 = firstRow.createCell(20);
        cellAnswer10.setCellValue("Answer10");

        Cell cellIsAnswer10Correct = firstRow.createCell(21);
        cellIsAnswer10Correct.setCellValue("IsAnswer10Correct");

        Cell cellOptionText1 = firstRow.createCell(22);
        cellOptionText1.setCellValue("OptionText1");

        Cell cellAnswerOption1 = firstRow.createCell(23);
        cellAnswerOption1.setCellValue("AnswerOption1");

        Cell cellOptionText2 = firstRow.createCell(24);
        cellOptionText2.setCellValue("OptionText2");

        Cell cellAnswerOption2 = firstRow.createCell(25);
        cellAnswerOption2.setCellValue("AnswerOption2");

        Cell cellOptionText3 = firstRow.createCell(26);
        cellOptionText3.setCellValue("OptionText3");

        Cell cellAnswerOption3 = firstRow.createCell(27);
        cellAnswerOption3.setCellValue("AnswerOption3");

        Cell cellOptionText4 = firstRow.createCell(28);
        cellOptionText4.setCellValue("OptionText4");

        Cell cellAnswerOption4 = firstRow.createCell(29);
        cellAnswerOption4.setCellValue("AnswerOption4");

        Cell cellOptionText5 = firstRow.createCell(30);
        cellOptionText5.setCellValue("OptionText5");

        Cell cellAnswerOption5 = firstRow.createCell(31);
        cellAnswerOption5.setCellValue("AnswerOption5");

        Cell cellOptionText6 = firstRow.createCell(32);
        cellOptionText6.setCellValue("OptionText6");

        Cell cellAnswerOption6 = firstRow.createCell(33);
        cellAnswerOption6.setCellValue("AnswerOption6");

        Cell cellOptionText7 = firstRow.createCell(34);
        cellOptionText7.setCellValue("OptionText7");

        Cell cellAnswerOption7 = firstRow.createCell(35);
        cellAnswerOption7.setCellValue("AnswerOption7");

        Cell cellOptionText8 = firstRow.createCell(36);
        cellOptionText8.setCellValue("OptionText8");

        Cell cellAnswerOption8 = firstRow.createCell(37);
        cellAnswerOption8.setCellValue("AnswerOption8");

        Cell cellOptionText9 = firstRow.createCell(38);
        cellOptionText9.setCellValue("OptionText9");

        Cell cellAnswerOption9 = firstRow.createCell(39);
        cellAnswerOption9.setCellValue("AnswerOption9");

        Cell cellOptionText10 = firstRow.createCell(40);
        cellOptionText10.setCellValue("OptionText10");

        Cell cellAnswerOption10 = firstRow.createCell(41);
        cellAnswerOption10.setCellValue("AnswerOption10");

        Cell cellSequenceText1 = firstRow.createCell(42);
        cellSequenceText1.setCellValue("SequenceText1");

        Cell cellSequenceText2 = firstRow.createCell(43);
        cellSequenceText2.setCellValue("SequenceText2");

        Cell cellSequenceText3 = firstRow.createCell(44);
        cellSequenceText3.setCellValue("SequenceText3");

        Cell cellSequenceText4 = firstRow.createCell(45);
        cellSequenceText4.setCellValue("SequenceText4");

        Cell cellSequenceText5 = firstRow.createCell(46);
        cellSequenceText5.setCellValue("SequenceText5");

        Cell cellSequenceText6 = firstRow.createCell(47);
        cellSequenceText6.setCellValue("SequenceText6");

        Cell cellSequenceText7 = firstRow.createCell(48);
        cellSequenceText7.setCellValue("SequenceText7");

        Cell cellSequenceText8 = firstRow.createCell(49);
        cellSequenceText8.setCellValue("SequenceText8");

        Cell cellSequenceText9 = firstRow.createCell(50);
        cellSequenceText9.setCellValue("SequenceText9");

        Cell cellSequenceText10 = firstRow.createCell(51);
        cellSequenceText10.setCellValue("SequenceText10");

        Cell cellShowAnswerHint = firstRow.createCell(52);
        cellShowAnswerHint.setCellValue("ShowAnswerHint");

        Cell cellCorrectToProceed = firstRow.createCell(53);
        cellCorrectToProceed.setCellValue("CorrectToProceed");

        Cell cellShowFeedback = firstRow.createCell(54);
        cellShowFeedback.setCellValue("ShowFeedback");

        Cell cellWeight = firstRow.createCell(55);
        cellWeight.setCellValue("Weight");

        Cell cellIsOptional = firstRow.createCell(56);
        cellIsOptional.setCellValue("IsOptional");

        Cell cellNoMarkingRequired = firstRow.createCell(57);
        cellNoMarkingRequired.setCellValue("NoMarkingRequired");

        Cell cellMarkingGuide = firstRow.createCell(58);
        cellMarkingGuide.setCellValue("Marking Guide");
    }

}
