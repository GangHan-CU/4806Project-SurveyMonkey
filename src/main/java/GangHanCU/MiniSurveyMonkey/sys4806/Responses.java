package GangHanCU.MiniSurveyMonkey.sys4806;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;

import javax.persistence.*;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = TextResponses.class, name = "TEXT"),
        @JsonSubTypes.Type(value = RangeResponses.class, name = "NUMBER"),
        @JsonSubTypes.Type(value = MultipleChoiceResponses.class, name = "MC")
})

@Entity
public abstract class Responses {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="RESPONSE_SEQ_GEN")
    @SequenceGenerator(name="RESPONSE_SEQ_GEN", sequenceName="RESPONSE_SEQ_GEN")
    protected int ID;
    protected QuestionType type;
    @ManyToOne(cascade = CascadeType.ALL)
    protected Questions question;

    public Responses(){}

    public Questions getQuestion() {
        return question;
    }

    public void setQuestion(Questions q) {
        question = q;
    }

    public int getID() {
        return ID;
    }

    public void setID(int i) {
        ID=i;
    }

    public void setType(QuestionType q) {
        type = q;
    }

    public QuestionType getType() {
        return type;
    }

}
