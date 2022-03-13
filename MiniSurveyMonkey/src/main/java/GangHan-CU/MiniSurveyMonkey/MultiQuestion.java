package Group28.MiniSurveyMonkey;

import java.util.List;

public class MultiQuestion extends Question{
    private List answers;
    private int correct;

    public MultiQuestion(String question, List answers, int correct){
        super.type = "multi";
        super.question = question;
        this.answers = answers;
        this.correct = correct;
    }

    public List getAnswers() {
        return answers;
    }

    public void setAnswers(List answers) {
        this.answers = answers;
    }

    public int getCorrect() {
        return correct;
    }

    public void setCorrect(int correct) {
        this.correct = correct;
    }
}
