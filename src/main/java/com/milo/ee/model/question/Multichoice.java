package com.milo.ee.model.question;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("MULTICHOICE")
public class Multichoice extends Question {

    private String answer1;
    private String isAnswer1;
    private String answer2;
    private String isAnswer2;
    private String answer3;
    private String isAnswer3;
    private String answer4;
    private String isAnswer4;
    private String answer5;
    private String isAnswer5;
    private String answer6;
    private String isAnswer6;
    private String answer7;
    private String isAnswer7;
    private String answer8;
    private String isAnswer8;
    private String answer9;
    private String isAnswer9;
    private String answer10;
    private String isAnswer10;

    public Multichoice() {
    }

    public Multichoice(String type, String questionText, String questionType, String answer1, String isAnswer1, String answer2, String isAnswer2, String answer3, String isAnswer3) {
        super(type, questionText, questionType);
        this.answer1 = answer1;
        this.isAnswer1 = isAnswer1;
        this.answer2 = answer2;
        this.isAnswer2 = isAnswer2;
        this.answer3 = answer3;
        this.isAnswer3 = isAnswer3;
    }

    public String getAnswer1() {
        return answer1;
    }

    public String isAnswer1() {
        return isAnswer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public String isAnswer2() {
        return isAnswer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public String isAnswer3() {
        return isAnswer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public String isAnswer4() {
        return isAnswer4;
    }

    public String getAnswer5() {
        return answer5;
    }

    public String isAnswer5() {
        return isAnswer5;
    }

    public String getAnswer6() {
        return answer6;
    }

    public String isAnswer6() {
        return isAnswer6;
    }

    public String getAnswer7() {
        return answer7;
    }

    public String isAnswer7() {
        return isAnswer7;
    }

    public String getAnswer8() {
        return answer8;
    }

    public String isAnswer8() {
        return isAnswer8;
    }

    public String getAnswer9() {
        return answer9;
    }

    public String isAnswer9() {
        return isAnswer9;
    }

    public String getAnswer10() {
        return answer10;
    }

    public String isAnswer10() {
        return isAnswer10;
    }

}
