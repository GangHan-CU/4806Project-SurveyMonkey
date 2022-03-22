package GangHanCU.MiniSurveyMonkey.sys4806;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ResponseTests {
    QuestionText t = new QuestionText("Test");
    TextResponses r = new TextResponses("Testing", t);

    @Test
    void testGetQuestion() {
        assertEquals(r.getQuestion(), t);
    }

    @Test
    void testSetQuestion() {
        QuestionText y = new QuestionText("More Test");
        r.setQuestion(y);
        assertEquals(r.getQuestion(), y);
        assertFalse(r.getQuestion() == t);
    }



    @Test
    void testID() {
        r.setID(13);
        assertEquals(r.getID(), 13);
    }

    @Test
    void testSetType() {
        r.setType(QuestionType.MultipleChoice);
        assertEquals(r.getType(), QuestionType.MultipleChoice);
    }

    @Test
    void testGetType() {
        assertEquals(r.getType(), QuestionType.Text);
    }
}
