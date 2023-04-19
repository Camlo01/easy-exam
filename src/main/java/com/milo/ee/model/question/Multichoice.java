package com.milo.ee.model.question;

public class Multichoice extends Question {

    private String answer1;
    private boolean isAnswer1;
    private String answer2;
    private boolean isAnswer2;
    private String answer3;
    private boolean isAnswer3;
    private String answer4;
    private boolean isAnswer4;
    private String answer5;
    private boolean isAnswer5;
    private String answer6;
    private boolean isAnswer6;
    private String answer7;
    private boolean isAnswer7;
    private String answer8;
    private boolean isAnswer8;
    private String answer9;
    private boolean isAnswer9;
    private String answer10;
    private boolean isAnswer10;

    public Multichoice() {
    }

    public Multichoice(String questionText, String questionType, String answer1, boolean isAnswer1, String answer2, boolean isAnswer2, String answer3, boolean isAnswer3) {
        super(questionText, questionType);
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

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public boolean isAnswer1() {
        return isAnswer1;
    }

    public void setAnswer1(boolean answer1) {
        isAnswer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public boolean isAnswer2() {
        return isAnswer2;
    }

    public void setAnswer2(boolean answer2) {
        isAnswer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public boolean isAnswer3() {
        return isAnswer3;
    }

    public void setAnswer3(boolean answer3) {
        isAnswer3 = answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }

    public boolean isAnswer4() {
        return isAnswer4;
    }

    public void setAnswer4(boolean answer4) {
        isAnswer4 = answer4;
    }

    public String getAnswer5() {
        return answer5;
    }

    public void setAnswer5(String answer5) {
        this.answer5 = answer5;
    }

    public boolean isAnswer5() {
        return isAnswer5;
    }

    public void setAnswer5(boolean answer5) {
        isAnswer5 = answer5;
    }

    public String getAnswer6() {
        return answer6;
    }

    public void setAnswer6(String answer6) {
        this.answer6 = answer6;
    }

    public boolean isAnswer6() {
        return isAnswer6;
    }

    public void setAnswer6(boolean answer6) {
        isAnswer6 = answer6;
    }

    public String getAnswer7() {
        return answer7;
    }

    public void setAnswer7(String answer7) {
        this.answer7 = answer7;
    }

    public boolean isAnswer7() {
        return isAnswer7;
    }

    public void setAnswer7(boolean answer7) {
        isAnswer7 = answer7;
    }

    public String getAnswer8() {
        return answer8;
    }

    public void setAnswer8(String answer8) {
        this.answer8 = answer8;
    }

    public boolean isAnswer8() {
        return isAnswer8;
    }

    public void setAnswer8(boolean answer8) {
        isAnswer8 = answer8;
    }

    public String getAnswer9() {
        return answer9;
    }

    public void setAnswer9(String answer9) {
        this.answer9 = answer9;
    }

    public boolean isAnswer9() {
        return isAnswer9;
    }

    public void setAnswer9(boolean answer9) {
        isAnswer9 = answer9;
    }

    public String getAnswer10() {
        return answer10;
    }

    public void setAnswer10(String answer10) {
        this.answer10 = answer10;
    }

    public boolean isAnswer10() {
        return isAnswer10;
    }

    public void setAnswer10(boolean answer10) {
        isAnswer10 = answer10;
    }
}
