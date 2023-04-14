package com.milo.ee.model.question;

/**
 * Abstract class Question that include field that every question has
 * @author Milo
 */
public abstract class Question {

    private String questionText;
    private String questionType;

    //    Config values
    private boolean showAnswerHint;
    private boolean correctToProceed;
    private String showFeedback;
    private String weight;
    private boolean isOptional;

    //    Empty constructor
    public Question() {
    }

//    Getters and setters
    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
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

//    Util methods
    public void setConfiguration(QConfiguration configuration) {
        this.showAnswerHint = configuration.isShowAnswerHint();
        this.correctToProceed = configuration.isCorrectToProceed();
        this.showFeedback = configuration.getShowFeedback();
        this.weight = configuration.getWeight();
        this.isOptional = configuration.isOptional();
    }

}
