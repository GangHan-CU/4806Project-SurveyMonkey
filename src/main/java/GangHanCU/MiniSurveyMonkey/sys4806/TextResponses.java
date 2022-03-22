package GangHanCU.MiniSurveyMonkey.sys4806;

import javax.persistence.Entity;

@Entity
public class TextResponses extends Responses{

    private String answer;

    public TextResponses(){
        type = QuestionType.Text;
    }

    public TextResponses(String r, Questions q) {
        answer = r;
        type = QuestionType.Text;
        question = q;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
