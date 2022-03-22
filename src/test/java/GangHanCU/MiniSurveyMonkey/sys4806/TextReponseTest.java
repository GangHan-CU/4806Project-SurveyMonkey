package GangHanCU.MiniSurveyMonkey.sys4806;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TextReponseTest {
    QuestionText t = new QuestionText("Test");
    TextResponses r = new TextResponses("Testing", t);

    @Test
    void testAnswer() {
        assertEquals(r.getAnswer(), "Testing");
        r.setAnswer("Changed");
        assertEquals(r.getAnswer(), "Changed");
    }
}
