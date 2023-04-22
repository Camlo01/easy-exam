package com.milo.ee.model.question;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Abstract class Question that include field that every question has
 *
 * @author Milo
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Freetext.class, name = "FREETEXT"),
        @JsonSubTypes.Type(value = Keyword.class, name = "KEYWORD"),
        @JsonSubTypes.Type(value = Match.class, name = "MATCH"),
        @JsonSubTypes.Type(value = Multichoice.class, name = "MULTICHOICE"),
        @JsonSubTypes.Type(value = Sequence.class, name = "SEQUENCE"),
})
public abstract class Question {

    private String type;
    private String questionText;
    private String questionType;

    //    Config values
    private String showAnswerHint;
    private String correctToProceed;
    private String showFeedback;
    private String weight;
    private String isOptional;
    private String noMarkingRequired;
    private String markingGuide;

    //    Empty constructor
    public Question() {
    }

    public Question(String questionText, String type) {
        this.questionText = questionText;
        this.type = type;
        this.questionType = type;
        this.showAnswerHint = "";
        this.correctToProceed = "";
        this.showFeedback = "";
        this.weight = "";
        this.isOptional = "";
        this.noMarkingRequired = "";
        this.markingGuide = "";
    }


    //    Getters and setters


    public String getType() {
        return type;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getQuestionType() {
        return questionType;
    }

    public String isShowAnswerHint() {
        return showAnswerHint;
    }

    public String isCorrectToProceed() {
        return correctToProceed;
    }

    public String getShowFeedback() {
        return showFeedback;
    }

    public String getWeight() {
        return weight;
    }

    public String isOptional() {
        return isOptional;
    }

    public String isNoMarkingRequired() {
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
//    public void setConfiguration(QConfiguration configuration) {
//        this.showAnswerHint = configuration.isShowAnswerHint();
//        this.correctToProceed = configuration.isCorrectToProceed();
//        this.showFeedback = configuration.getShowFeedback();
//        this.weight = configuration.getWeight();
//        this.isOptional = configuration.isOptional();
//    }

}
