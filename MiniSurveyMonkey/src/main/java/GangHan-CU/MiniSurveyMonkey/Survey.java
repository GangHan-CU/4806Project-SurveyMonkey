package Group28.MiniSurveyMonkey;

import java.util.ArrayList;
import java.util.List;

public class Survey {
    private ArrayList<Question> questions;
    private boolean surveyClosed = true;
    private boolean editable = true;

    public Survey(){
        questions = new ArrayList<Question>();
    }

    public void addOpenQuestion() {
        String question = "";
        questions.add(new OpenQuestion(question));
    }

    public void addMultiQuestion() {
        String question = "";
        ArrayList<String> answers = new ArrayList<String>();
        int correct = -1;
        questions.add(new MultiQuestion(question, answers, correct));
    }

    public void addNumberQuestion() {
        String question = "";
        int min = 0;
        int max = 0;
        questions.add(new NumberQuestion(question, min, max));
    }

    public Question getQuestionByIndex(int index){
        return questions.get(index);
    }

    public void addQuestion(Question question){
        questions.add(question);
    }

    public ArrayList getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList questions) {
        this.questions = questions;
    }

    public void closeSurvey(){
        this.surveyClosed = true;
        this.editable = true;
    }

    public void publishSurvey(){
        this.surveyClosed = false;
        this.editable = false;
    }

    public boolean getEditable(){
        return this.editable;
    }

    public boolean getSurveyClosed(){
        return this.surveyClosed;
    }


}
