package GangHanCU.MiniSurveyMonkey.sys4806;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true
)
@JsonSubTypes({
        @JsonSubTypes.Type (value = QuestionText.class, name = "TEXT"),
        @JsonSubTypes.Type(value = QuestionNum.class, name = "NUMBER"),
        @JsonSubTypes.Type(value = QuestionMc.class, name = "MultipleChoice")


})
@Entity
public abstract class Questions {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="QUESTION_SEQ_GEN")
    @SequenceGenerator(name="QUESTION_SEQ_GEN", sequenceName="QUESTION_SEQ_GEN")
    protected int ID;
    @ManyToOne(cascade = CascadeType.ALL)
    private Survey survey;
    protected QuestionType type;
    protected String prompt;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "question")
    protected List<Response> responses;

    public Questions() {
        responses = new ArrayList<>();
    }

    public void setPrompt(String p) {
        prompt = p;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setID(int i) {
        ID = i;
    }

    public int getID() {
        return ID;
    }

    public void setType(QuestionType q) {
        type = q;
    }

    public QuestionType getType() {
        return type;
    }

    public Survey getSurvey(){
        return this.survey;
    }

    public void setSurvey(Survey survey){
        this.survey = survey;
    }


    public void addResponse(Response r) {
        responses.add(r);
    }


    public void setResponses(List<Response> responses) {
        this.responses = responses;
    }

    public List<Response> getResponses(){
        return this.responses;

    }

}
