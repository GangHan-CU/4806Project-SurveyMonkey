package GangHanCU.MiniSurveyMonkey.sys4806;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
public class QuestionMc extends Questions{
    @ElementCollection
    private List<String> choices;

    public QuestionMc(){
        this.type = QuestionType.MultipleChoice;
        choices = new ArrayList<>();
    }

    public QuestionMc(String prompt, List<String> choices) {
        this.type = QuestionType.MultipleChoice;
        this.prompt = prompt;
        this.choices = choices;
    }

    public void addChoice(String choice) {
        choices.add(choice);
    }

    public void removeChoice(int choiceNumber) {
        choices.remove(choiceNumber);
    }

    public List<String> getChoices() {
        return choices;
    }
}
