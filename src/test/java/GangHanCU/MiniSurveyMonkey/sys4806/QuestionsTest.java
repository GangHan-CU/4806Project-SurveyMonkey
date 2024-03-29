package GangHanCU.MiniSurveyMonkey.sys4806;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class QuestionsTest {
    QuestionText t = new QuestionText("Test");
    Surveys s = new Surveys("Test Survey");
    TextResponses r = new TextResponses("Testing", t);




    @Test
    void testSetPrompt() {
        t.setPrompt("This is different now");
        assertEquals(t.getPrompt(), "This is different now");
    }

    @Test
    void testGetPrompt() {
        assertEquals(t.getPrompt(), "Test");
    }

    @Test
    void testID() {
        t.setID(12);
        assertEquals(t.getID(), 12);
    }


    @Test
    void testSetType() {
        t.setType(QuestionType.NumberRange);
        assertTrue(t.getType() == QuestionType.NumberRange);
    }

    @Test
    void testGetType() {
        assertTrue(t.getType() == QuestionType.Text);
    }

    @Test
    void testSurvey() {
        t.setSurvey(s);
        assertEquals(t.getSurvey().getName(), "Test Survey");
    }



    @Test
    void testResponse() {
        t.addResponse(r);
        assertEquals(t.getResponses().get(0),r);
    }

}
