package com.milo.ee.model.question;


import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("KEYWORD")
public class Keyword extends Question {

    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private String answer5;
    private String answer6;
    private String answer7;
    private String answer8;
    private String answer9;
    private String answer10;

    public Keyword() {
    }

    public Keyword(String type, String questionText, String questionType, String answer1) {
        super(type, questionText, questionType);
        this.answer1 = answer1;
    }

    public Keyword(String type, String questionText, String questionType, String answer1, String answer2) {
        super(type, questionText, questionType);
        this.answer1 = answer1;
        this.answer2 = answer2;
    }

    public Keyword(String type, String questionText, String questionType, String answer1, String answer2, String answer3) {
        super(type, questionText, questionType);
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
    }

    public Keyword(String type, String questionText, String questionType, String answer1, String answer2, String answer3, String answer4) {
        super(type, questionText, questionType);
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
    }

    public Keyword(String type, String questionText, String questionType, String answer1, String answer2, String answer3, String answer4, String answer5) {
        super(type, questionText, questionType);
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.answer5 = answer5;
    }

    public Keyword(String type, String questionText, String questionType, String answer1, String answer2, String answer3, String answer4, String answer5, String answer6) {
        super(type, questionText, questionType);
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.answer5 = answer5;
        this.answer6 = answer6;
    }

    public Keyword(String type, String questionText, String questionType, String answer1, String answer2, String answer3, String answer4, String answer5, String answer6, String answer7) {
        super(type, questionText, questionType);
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.answer5 = answer5;
        this.answer6 = answer6;
        this.answer7 = answer7;
    }

    public Keyword(String type, String questionText, String questionType, String answer1, String answer2, String answer3, String answer4, String answer5, String answer6, String answer7, String answer8) {
        super(type, questionText, questionType);
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.answer5 = answer5;
        this.answer6 = answer6;
        this.answer7 = answer7;
        this.answer8 = answer8;
    }

    public Keyword(String type, String questionText, String questionType, String answer1, String answer2, String answer3, String answer4, String answer5, String answer6, String answer7, String answer8, String answer9) {
        super(type, questionText, questionType);
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.answer5 = answer5;
        this.answer6 = answer6;
        this.answer7 = answer7;
        this.answer8 = answer8;
        this.answer9 = answer9;
    }

    public Keyword(String type, String questionText, String questionType, String answer1, String answer2, String answer3, String answer4, String answer5, String answer6, String answer7, String answer8, String answer9, String answer10) {
        super(type, questionText, questionType);
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.answer5 = answer5;
        this.answer6 = answer6;
        this.answer7 = answer7;
        this.answer8 = answer8;
        this.answer9 = answer9;
        this.answer10 = answer10;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }

    public String getAnswer5() {
        return answer5;
    }

    public void setAnswer5(String answer5) {
        this.answer5 = answer5;
    }

    public String getAnswer6() {
        return answer6;
    }

    public void setAnswer6(String answer6) {
        this.answer6 = answer6;
    }

    public String getAnswer7() {
        return answer7;
    }

    public void setAnswer7(String answer7) {
        this.answer7 = answer7;
    }

    public String getAnswer8() {
        return answer8;
    }

    public void setAnswer8(String answer8) {
        this.answer8 = answer8;
    }

    public String getAnswer9() {
        return answer9;
    }

    public void setAnswer9(String answer9) {
        this.answer9 = answer9;
    }

    public String getAnswer10() {
        return answer10;
    }

    public void setAnswer10(String answer10) {
        this.answer10 = answer10;
    }
}
