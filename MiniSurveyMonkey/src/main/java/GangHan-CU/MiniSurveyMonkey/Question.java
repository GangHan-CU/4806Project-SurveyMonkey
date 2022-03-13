package Group28.MiniSurveyMonkey;

public class Question {
    protected String type; //Type of question i.e open-ended, multiple choice, range
    protected String question;

    //Default constructor
    public Question() {}

    //Todo
    public void displayQuestion() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }


}
