package GangHanCU.MiniSurveyMonkey.sys4806;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuestionsMcTests {
    private QuestionMc q;
    private List<String> choices = new ArrayList<String>();

    @Test
    public void testDefaultConstructor() {
        QuestionMc q = new QuestionMc();
        assertEquals(q.getType(), QuestionType.MultipleChoice);
        assertNotNull(q.getChoices());
    }

    @Test
    public void testMethods() {
        choices.add("Yes");
        choices.add("No");
        q = new QuestionMc("Can I offer you a nice egg in this trying time?", choices);
        assertEquals(q.getType(), QuestionType.MultipleChoice);
        assertEquals(choices, q.getChoices());
        q.addChoice("Maybe");
        assertEquals(3, q.getChoices().size());
        q.removeChoice(2);
        assertEquals(2, q.getChoices().size());
    }
}
