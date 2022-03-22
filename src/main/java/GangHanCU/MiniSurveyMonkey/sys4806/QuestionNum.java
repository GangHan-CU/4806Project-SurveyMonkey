package GangHanCU.MiniSurveyMonkey.sys4806;

import javax.persistence.Entity;

@Entity
public class QuestionNum extends Questions{
    private int min;
    private int max;

    public QuestionNum(){
        type = QuestionType.NumberRange;
    }

    public QuestionNum(String Prompt, int min, int max) {
        type = QuestionType.NumberRange;
        this.prompt = Prompt;
        this.min = min;
        this.max = max;


    }

    public boolean addResponse(RangeResponses r) {
        if(r.getAnswer() < min || r.getAnswer() > max) {
            return false;
        }else {
            responses.add((Responses)r);
            return true;

        }
    }

    public void setMin(int m) {
        min = m;
    }

    public int getMin() {
        return min;
    }

    public void setMax(int m) {
        max = m;
    }

    public int getMax() {
        return max;
    }
}
