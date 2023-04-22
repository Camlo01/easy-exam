package com.milo.ee.model.question;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Abstract class Question that include field that every question has
 *
 * @author Milo
 */
@JsonTypeName("FREETEXT")
public class Freetext extends Question {

    public Freetext(String type, String questionText, String questionType) {
        super(type, questionText, questionType);
    }

    @Override
    public String toString() {
        return "Freetext{" +
                "questionText=" + super.getQuestionText() +
                ", questionType='" + super.getQuestionType() + '\'' +
                '}';
    }
}
