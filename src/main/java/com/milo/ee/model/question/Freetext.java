package com.milo.ee.model.question;

/**
 * Abstract class Question that include field that every question has
 *
 * @author Milo
 */
public class Freetext extends Question {

    public Freetext(String questionText, String questionType) {
        super(questionText, questionType);
    }

    @Override
    public String toString() {
        return "Freetext{" +
                "questionText=" + super.getQuestionText() +
                ", questionType='" + super.getQuestionType() + '\'' +
                '}';
    }
}
