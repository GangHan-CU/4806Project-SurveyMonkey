package GangHanCU.MiniSurveyMonkey.sys4806;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Surveys {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="QUESTION_SEQ_GEN")
    @SequenceGenerator(name="QUESTION_SEQ_GEN", sequenceName="QUESTION_SEQ_GEN")
    protected int ID;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "survey")
    protected List<Questions> questions;

    @ManyToOne
    private User creator;

    private String name;

    private boolean closed;

    public Surveys(){
        // create survey with default name
        this("");
    }

    public Surveys(String name) {
        questions = new ArrayList<Questions>();
        this.name = name;
        this.closed = false;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public List<Questions> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Questions> questions) {
        this.questions = questions;
    }

    public void addQuestion(Questions q){
        this.questions.add(q);
    }

    public void removeQuestion(Questions q){
        this.questions.remove(q);
    }

    public boolean getClosed(){
        return this.closed;
    }

    public void setClosed(){
        this.closed=true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getCreator(){
        return this.creator;
    }

    public void setCreator(User creator){
        this.creator = creator;
    }

    public int size(){
        return this.questions.size();
    }

    public String toString(){
        String s = "Survey "+this.getName()+" questions:\n";
        for(Questions q: questions){
            s+=q.toString();
            s+="\n";
        }
        return s;
    }
}
