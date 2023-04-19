package com.milo.ee.service;

import com.milo.ee.model.question.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class QuestionService {

    /**
     * Method in charge of saving objects of an ArrayList of Question in a Workbook
     *
     * @param workbook  in which to save the questions
     * @param questions to save
     */
    public void saveQuestions(Workbook workbook, ArrayList<Question> questions) {
        for (int i = 0; i < questions.size(); i++) {
            System.out.println(questions.get(i).toString());
            Row rowForThisQuestion = workbook.getSheetAt(0).createRow(i + 1);
            setValuesInRow(questions.get(i), rowForThisQuestion);
        }
    }

    public void exportAsCSV(Workbook workbook) {
        String nonImplementeMethodMessage = "Oops! It looks like this method hasn't been implemented yet. We're working on it, thank you for your patience!";
        throw new UnsupportedOperationException(nonImplementeMethodMessage);
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

            default -> System.out.println("Something went wrong");
        }
    }

    /**
     * configure the values of the questions in their corresponding row
     *
     * @param freeText type of question
     * @param row
     */
    private void setValuesFreetextQuestion(Freetext freeText, Row row) {
        setConfigValuesInRow(freeText, row);
    }

    /**
     * configure the values of the questions in their corresponding row
     *
     * @param multichoice type of question
     * @param row
     */
    private void setValuesMultichoiceQuestion(Multichoice multichoice, Row row) {

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
     * @param row
     */
    private void setValuesKeywordQuestion(Keyword keyword, Row row) {

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
     * @param row
     */
    private void setValuesMatchQuestion(Match match, Row row) {
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
     * @param row
     */
    private void setValuesSequenceQuestion(Sequence sequence, Row row) {

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
     * @param question
     * @param row
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

}