package com.milo.ee.model.question;

/**
 * Abstract class Question that include field that every question has
 * @author Milo
 */
public class Freetext extends Question {

    private boolean NoMarkingRequired;
    private String marking;

    public Freetext() {
    }

    public boolean isNoMarkingRequired() {
        return NoMarkingRequired;
    }

    public void setNoMarkingRequired(boolean noMarkingRequired) {
        NoMarkingRequired = noMarkingRequired;
    }

    public String getMarking() {
        return marking;
    }

    public void setMarking(String marking) {
        this.marking = marking;
    }
}
