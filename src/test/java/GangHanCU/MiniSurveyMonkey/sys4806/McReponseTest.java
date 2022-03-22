package GangHanCU.MiniSurveyMonkey.sys4806;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class McReponseTest {
    private MultipleChoiceResponses r;

    @Test
    void testDefaultConstructor() {
        MultipleChoiceResponses response = new MultipleChoiceResponses();
        assertEquals(response.getType(), QuestionType.MultipleChoice);
    }

    @Test
    void testAnswer() {
        QuestionMc q = new QuestionMc();
        String answer = "I chose this";
        String newAnswer = "I chose this after";
        r = new MultipleChoiceResponses(answer, q);
        assertEquals(r.getType(), QuestionType.MultipleChoice);
        assertEquals(answer, r.getAnswer());
        r.setAnswer(newAnswer);
        assertEquals(newAnswer, r.getAnswer());
    }
}
