package com.milo.ee.model.question;

public class QConfiguration {

    //    Config values
    private boolean showAnswerHint;
    private boolean correctToProceed;
    private String showFeedback;
    private String weight;
    private boolean isOptional;
    private boolean NoMarkingRequired;
    private String marking;

    public QConfiguration() {
    }

    public boolean isShowAnswerHint() {
        return showAnswerHint;
    }

    public void setShowAnswerHint(boolean showAnswerHint) {
        this.showAnswerHint = showAnswerHint;
    }

    public boolean isCorrectToProceed() {
        return correctToProceed;
    }

    public void setCorrectToProceed(boolean correctToProceed) {
        this.correctToProceed = correctToProceed;
    }

    public String getShowFeedback() {
        return showFeedback;
    }

    public void setShowFeedback(String showFeedback) {
        this.showFeedback = showFeedback;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public boolean isOptional() {
        return isOptional;
    }

    public void setOptional(boolean optional) {
        isOptional = optional;
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
