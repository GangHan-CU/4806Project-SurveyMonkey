package GangHanCU.MiniSurveyMonkey.sys4806;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class QuestionTextTest {

    @Test
    void testTextQuestion() {
        QuestionText t = new QuestionText("Test");
        assertTrue(t.getType() == QuestionType.Text);
    }

}
