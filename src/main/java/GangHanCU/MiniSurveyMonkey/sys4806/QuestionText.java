package GangHanCU.MiniSurveyMonkey.sys4806;

import javax.persistence.Entity;

@Entity
public class QuestionText extends Questions{
    public QuestionText(){
        type = QuestionType.Text;
    }

    public QuestionText(String Prompt) {
        type = QuestionType.Text;
        this.prompt = Prompt;


    }
}
