package GangHanCU.MiniSurveyMonkey.sys4806;

import javax.persistence.Entity;

@Entity
public class RangeResponses extends Responses{
    private int answer;

    public RangeResponses(){
        type = QuestionType.NumberRange;
    }

    public RangeResponses(int a, Questions q) {
        type = QuestionType.NumberRange;
        answer = a;
        question = q;

    }

    public int getAnswer() {
        return answer;
    }

    public boolean setAnswer(int answer) {
        QuestionNum r = (QuestionNum) question;
        if(answer < r.getMin() || answer > r.getMax() ) {
            return false;
        }else {
            this.answer = answer;
            return true;
        }

    }
}
