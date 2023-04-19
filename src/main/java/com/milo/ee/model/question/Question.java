package com.milo.ee.model.question;

/**
 * Abstract class Question that include field that every question has
 *
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
    private boolean noMarkingRequired;
    private String markingGuide;

    //    Empty constructor
    public Question() {
    }

    public Question(String questionText, String questionType) {
        this.questionText = questionText;
        this.questionType = questionType;
        this.showAnswerHint = false;
        this.correctToProceed = false;
        this.showFeedback = "";
        this.weight = "";
        this.isOptional = false;
        this.noMarkingRequired = false;
        this.markingGuide = "";
    }

    //    Getters and setters

    public String getQuestionText() {
        return questionText;
    }

    public String getQuestionType() {
        return questionType;
    }

    public boolean isShowAnswerHint() {
        return showAnswerHint;
    }

    public boolean isCorrectToProceed() {
        return correctToProceed;
    }

    public String getShowFeedback() {
        return showFeedback;
    }

    public String getWeight() {
        return weight;
    }

    public boolean isOptional() {
        return isOptional;
    }

    public boolean isNoMarkingRequired() {
        return noMarkingRequired;
    }

    public String getMarkingGuide() {
        return markingGuide;
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionText='" + questionText + '\'' +
                ", questionType='" + questionType + '\'' +
                '}';
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
