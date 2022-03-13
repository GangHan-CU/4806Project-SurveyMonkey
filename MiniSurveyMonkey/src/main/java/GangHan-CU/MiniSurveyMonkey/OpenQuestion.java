package Group28.MiniSurveyMonkey;

import Group28.MiniSurveyMonkey.Question;

public class OpenQuestion extends Question {

    private String answer;

    public OpenQuestion(String question){
        super.type = "open";
        super.question = question;
    }

    public void setAnswer(String answer){
        this.answer = answer;
    }

    public String getAnswer(){
        return this.answer;
    }

    public String getQuestion(){
        return this.question;
    }

    public void setQuestion(String question){
        this.question = question;
    }


}
