package GangHanCU.MiniSurveyMonkey.sys4806;

import javax.persistence.Entity;

@Entity
public class MultipleChoiceResponses extends Responses{
    private String answer;

    public MultipleChoiceResponses() {
        this.type = QuestionType.MultipleChoice;
    }

    public MultipleChoiceResponses(String answer, Questions q) {
        this.type = QuestionType.MultipleChoice;
        this.answer = answer;
        this.question = q;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return this.answer;
    }
}
