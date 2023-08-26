package com.milo.ee.service;

import com.milo.ee.EeApplication;
import com.milo.ee.model.question.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class QuestionService {

    /**
     * Method in charge of save questions from the ArrayList of Questions in the Workbook
     *
     * @param workbook  in which to save the questions
     * @param questions to save
     */
    public void saveQuestions(Workbook workbook, ArrayList<Question> questions) {
        for (int i = 0; i < questions.size(); i++) {
            Row newQuestion = workbook.getSheetAt(0).createRow(i + 1);
            setValuesInRow(questions.get(i), newQuestion);
        }
    }

    /**
     * Method in charge of configuring values of a question according to its type
     *
     * @param question question to get the values from and validate its type
     * @param row      in which to set values
     */
    private void setValuesInRow(Question question, Row row) {
        switch (question.getQuestionType()) {

            case "FREETEXT" -> setValuesFreetextQuestion((Freetext) question, row);

            case "MULTICHOICE" -> setValuesMultichoiceQuestion((Multichoice) question, row);

            case "KEYWORD" -> setValuesKeywordQuestion((Keyword) question, row);

            case "MATCH" -> setValuesMatchQuestion((Match) question, row);

            case "SEQUENCE" -> setValuesSequenceQuestion((Sequence) question, row);

            default -> {
                final Log Log = LogFactory.getLog(EeApplication.class);

                System.out.println();
                Log.error("Something went wrong!");
                System.out.println();

            }
        }
    }

    /**
     * configure the values of the questions in their corresponding row
     *
     * @param freeText type of question
     * @param row where to set the free text question
     */
    private void setValuesFreetextQuestion(Freetext freeText, Row row) {
        setAllCellsEmpty(row);
        setConfigValuesInRow(freeText, row);
    }

    /**
     * configure the values of the questions in their corresponding row
     *
     * @param multichoice type of question
     * @param row where to set the multichoice question
     */
    private void setValuesMultichoiceQuestion(Multichoice multichoice, Row row) {
        setAllCellsEmpty(row);

        Cell cell1 = row.createCell(2);
        cell1.setCellValue(multichoice.getAnswer1());

        Cell cell2 = row.createCell(3);
        cell2.setCellValue(multichoice.isAnswer1());

        Cell cell3 = row.createCell(4);
        cell3.setCellValue(multichoice.getAnswer2());

        Cell cell4 = row.createCell(5);
        cell4.setCellValue(multichoice.isAnswer2());

        Cell cell5 = row.createCell(6);
        cell5.setCellValue(multichoice.getAnswer3());

        Cell cell6 = row.createCell(7);
        cell6.setCellValue(multichoice.isAnswer3());

        Cell cell7 = row.createCell(8);
        cell7.setCellValue(multichoice.getAnswer4());

        Cell cell8 = row.createCell(9);
        cell8.setCellValue(multichoice.isAnswer4());

        Cell cell9 = row.createCell(10);
        cell9.setCellValue(multichoice.getAnswer5());

        Cell cell10 = row.createCell(11);
        cell10.setCellValue(multichoice.isAnswer5());

        Cell cell11 = row.createCell(12);
        cell11.setCellValue(multichoice.getAnswer6());

        Cell cell12 = row.createCell(13);
        cell12.setCellValue(multichoice.isAnswer6());

        Cell cell13 = row.createCell(14);
        cell13.setCellValue(multichoice.getAnswer7());

        Cell cell14 = row.createCell(15);
        cell14.setCellValue(multichoice.isAnswer7());

        Cell cell15 = row.createCell(16);
        cell15.setCellValue(multichoice.getAnswer8());

        Cell cell16 = row.createCell(17);
        cell16.setCellValue(multichoice.isAnswer8());

        Cell cell17 = row.createCell(18);
        cell17.setCellValue(multichoice.getAnswer9());

        Cell cell18 = row.createCell(19);
        cell18.setCellValue(multichoice.isAnswer9());

        Cell cell19 = row.createCell(20);
        cell19.setCellValue(multichoice.getAnswer10());

        Cell cell20 = row.createCell(21);
        cell20.setCellValue(multichoice.isAnswer10());


//        Config values
        setConfigValuesInRow(multichoice, row);
    }

    /**
     * configure the values of the questions in their corresponding row
     *
     * @param keyword type of question
     * @param row where to set the keyword question
     */
    private void setValuesKeywordQuestion(Keyword keyword, Row row) {
        setAllCellsEmpty(row);

        Cell cell2 = row.createCell(2);
        cell2.setCellValue(keyword.getAnswer1());

        Cell cell4 = row.createCell(4);
        cell4.setCellValue(keyword.getAnswer2());

        Cell cell6 = row.createCell(6);
        cell6.setCellValue(keyword.getAnswer3());

        Cell cell8 = row.createCell(8);
        cell8.setCellValue(keyword.getAnswer4());

        Cell cell10 = row.createCell(10);
        cell10.setCellValue(keyword.getAnswer5());

        Cell cell12 = row.createCell(12);
        cell12.setCellValue(keyword.getAnswer6());

        Cell cell14 = row.createCell(14);
        cell14.setCellValue(keyword.getAnswer7());

        Cell cell16 = row.createCell(16);
        cell16.setCellValue(keyword.getAnswer8());

        Cell cell18 = row.createCell(18);
        cell18.setCellValue(keyword.getAnswer9());

        Cell cell20 = row.createCell(20);
        cell20.setCellValue(keyword.getAnswer10());

        setConfigValuesInRow(keyword, row);
    }

    /**
     * configure the values of the questions in their corresponding row
     *
     * @param match type of question
     * @param row where to set the Match question
     */
    private void setValuesMatchQuestion(Match match, Row row) {
        setAllCellsEmpty(row);

        Cell cell1 = row.createCell(22);
        cell1.setCellValue(match.getOptionText1());

        Cell cell2 = row.createCell(23);
        cell2.setCellValue(match.getAnswerOption1());

        Cell cell3 = row.createCell(24);
        cell3.setCellValue(match.getOptionText2());

        Cell cell4 = row.createCell(25);
        cell4.setCellValue(match.getAnswerOption2());

        Cell cell5 = row.createCell(26);
        cell5.setCellValue(match.getOptionText3());

        Cell cell6 = row.createCell(27);
        cell6.setCellValue(match.getAnswerOption3());

        Cell cell7 = row.createCell(28);
        cell7.setCellValue(match.getOptionText4());

        Cell cell8 = row.createCell(29);
        cell8.setCellValue(match.getAnswerOption4());

        Cell cell9 = row.createCell(30);
        cell9.setCellValue(match.getOptionText5());

        Cell cell10 = row.createCell(31);
        cell10.setCellValue(match.getAnswerOption5());

        Cell cell11 = row.createCell(32);
        cell11.setCellValue(match.getOptionText6());

        Cell cell12 = row.createCell(33);
        cell12.setCellValue(match.getAnswerOption6());

        Cell cell13 = row.createCell(34);
        cell13.setCellValue(match.getOptionText7());

        Cell cell14 = row.createCell(35);
        cell14.setCellValue(match.getAnswerOption7());

        Cell cell15 = row.createCell(36);
        cell15.setCellValue(match.getOptionText8());

        Cell cell16 = row.createCell(37);
        cell16.setCellValue(match.getAnswerOption8());

        Cell cell17 = row.createCell(38);
        cell17.setCellValue(match.getOptionText9());

        Cell cell18 = row.createCell(39);
        cell18.setCellValue(match.getAnswerOption9());

        Cell cell19 = row.createCell(40);
        cell19.setCellValue(match.getOptionText10());

        Cell cell20 = row.createCell(41);
        cell20.setCellValue(match.getAnswerOption10());

        setConfigValuesInRow(match, row);
    }

    /**
     * configure the values of the questions in their corresponding row
     *
     * @param sequence type of question
     * @param row where to set the sequence question
     */
    private void setValuesSequenceQuestion(Sequence sequence, Row row) {
        setAllCellsEmpty(row);


        Cell cell1 = row.createCell(42);
        cell1.setCellValue(sequence.getSequenceText1());

        Cell cell2 = row.createCell(43);
        cell2.setCellValue(sequence.getSequenceText2());

        Cell cell3 = row.createCell(44);
        cell3.setCellValue(sequence.getSequenceText3());

        Cell cell4 = row.createCell(45);
        cell4.setCellValue(sequence.getSequenceText4());

        Cell cell5 = row.createCell(46);
        cell5.setCellValue(sequence.getSequenceText5());

        Cell cell6 = row.createCell(47);
        cell6.setCellValue(sequence.getSequenceText6());

        Cell cell7 = row.createCell(48);
        cell7.setCellValue(sequence.getSequenceText7());

        Cell cell8 = row.createCell(49);
        cell8.setCellValue(sequence.getSequenceText8());

        Cell cell9 = row.createCell(50);
        cell9.setCellValue(sequence.getSequenceText9());

        Cell cell10 = row.createCell(51);
        cell10.setCellValue(sequence.getSequenceText10());

        setConfigValuesInRow(sequence, row);
    }

    /**
     * function in charge of configuring the configuration values of the questions
     *
     * @param question to set default configuration
     * @param row of question
     */
    private void setConfigValuesInRow(Question question, Row row) {

//        Text
        Cell cell1 = row.createCell(0);
        cell1.setCellValue(question.getQuestionText());

//        Type
        Cell cell2 = row.createCell(1);
        cell2.setCellValue(question.getQuestionType());

//        Other aspects
        Cell cell53 = row.createCell(52);
        cell53.setCellValue(question.isShowAnswerHint());

        Cell cell54 = row.createCell(53);
        cell54.setCellValue(question.isCorrectToProceed());

        Cell cell55 = row.createCell(54);
        cell55.setCellValue(question.getShowFeedback());

        Cell cell56 = row.createCell(55);
        cell56.setCellValue(question.getWeight());

        Cell cell57 = row.createCell(56);
        cell57.setCellValue(question.isOptional());

        Cell cell58 = row.createCell(57);
        cell58.setCellValue(question.isNoMarkingRequired());

        Cell cell59 = row.createCell(58);
        cell59.setCellValue(question.getMarkingGuide());
    }


    /**
     * method created to solve no existence cells problem
     * @param row from what set empty the cell
     */
    public void setAllCellsEmpty(Row row){

        Cell cell1 = row.createCell(0);
        cell1.setCellValue("");

        Cell cell2 = row.createCell(1);
        cell2.setCellValue("");

        Cell cell3 = row.createCell(2);
        cell3.setCellValue("");

        Cell cell4 = row.createCell(3);
        cell4.setCellValue("");

        Cell cell5 = row.createCell(4);
        cell5.setCellValue("");

        Cell cell6 = row.createCell(5);
        cell6.setCellValue("");

        Cell cell7 = row.createCell(6);
        cell7.setCellValue("");

        Cell cell8 = row.createCell(7);
        cell8.setCellValue("");

        Cell cell9 = row.createCell(8);
        cell9.setCellValue("");

        Cell cell10 = row.createCell(9);
        cell10.setCellValue("");

        Cell cell11 = row.createCell(10);
        cell11.setCellValue("");

        Cell cell12 = row.createCell(11);
        cell12.setCellValue("");

        Cell cell13 = row.createCell(12);
        cell13.setCellValue("");

        Cell cell14 = row.createCell(13);
        cell14.setCellValue("");

        Cell cell15 = row.createCell(14);
        cell15.setCellValue("");

        Cell cell16 = row.createCell(15);
        cell16.setCellValue("");

        Cell cell17 = row.createCell(16);
        cell17.setCellValue("");

        Cell cell18 = row.createCell(17);
        cell18.setCellValue("");

        Cell cell19 = row.createCell(18);
        cell19.setCellValue("");

        Cell cell20 = row.createCell(19);
        cell20.setCellValue("");

        Cell cell21 = row.createCell(20);
        cell21.setCellValue("");

        Cell cell22 = row.createCell(21);
        cell22.setCellValue("");

        Cell cell23 = row.createCell(22);
        cell23.setCellValue("");

        Cell cell24 = row.createCell(23);
        cell24.setCellValue("");

        Cell cell25 = row.createCell(24);
        cell25.setCellValue("");

        Cell cell26 = row.createCell(25);
        cell26.setCellValue("");

        Cell cell27 = row.createCell(26);
        cell27.setCellValue("");

        Cell cell28 = row.createCell(27);
        cell28.setCellValue("");

        Cell cell29 = row.createCell(28);
        cell29.setCellValue("");

        Cell cell30 = row.createCell(29);
        cell30.setCellValue("");

        Cell cell31 = row.createCell(30);
        cell31.setCellValue("");

        Cell cell32 = row.createCell(31);
        cell32.setCellValue("");

        Cell cell33 = row.createCell(32);
        cell33.setCellValue("");

        Cell cell34 = row.createCell(33);
        cell34.setCellValue("");

        Cell cell35 = row.createCell(34);
        cell35.setCellValue("");

        Cell cell36 = row.createCell(35);
        cell36.setCellValue("");

        Cell cell37 = row.createCell(36);
        cell37.setCellValue("");

        Cell cell38 = row.createCell(37);
        cell38.setCellValue("");

        Cell cell39 = row.createCell(38);
        cell39.setCellValue("");

        Cell cell40 = row.createCell(39);
        cell40.setCellValue("");

        Cell cell41 = row.createCell(40);
        cell41.setCellValue("");

        Cell cell42 = row.createCell(41);
        cell42.setCellValue("");

        Cell cell43 = row.createCell(42);
        cell43.setCellValue("");

        Cell cell44 = row.createCell(43);
        cell44.setCellValue("");

        Cell cell45 = row.createCell(44);
        cell45.setCellValue("");

        Cell cell46 = row.createCell(45);
        cell46.setCellValue("");

        Cell cell47 = row.createCell(46);
        cell47.setCellValue("");

        Cell cell48 = row.createCell(47);
        cell48.setCellValue("");

        Cell cell49 = row.createCell(48);
        cell49.setCellValue("");

        Cell cell50 = row.createCell(49);
        cell50.setCellValue("");

        Cell cell51 = row.createCell(50);
        cell51.setCellValue("");

        Cell cell52 = row.createCell(51);
        cell52.setCellValue("");

        Cell cell53 = row.createCell(52);
        cell53.setCellValue("");

        Cell cell54 = row.createCell(53);
        cell54.setCellValue("");

        Cell cell55 = row.createCell(54);
        cell55.setCellValue("");

        Cell cell56 = row.createCell(52);
        cell56.setCellValue("");

        Cell cell57 = row.createCell(56);
        cell57.setCellValue("");

        Cell cell58 = row.createCell(57);
        cell58.setCellValue("");

        Cell cell59 = row.createCell(58);
        cell59.setCellValue("");

    }

}