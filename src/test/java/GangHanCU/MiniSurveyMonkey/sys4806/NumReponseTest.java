package GangHanCU.MiniSurveyMonkey.sys4806;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class NumReponseTest {
    QuestionNum q = new QuestionNum ("Test", 1 , 9) ;
    RangeResponses r = new RangeResponses(5, q);

    @Test
    void testGetAnswer() {
        assertEquals(r.getAnswer(), 5);
    }

    @Test
    void testSetAnswer() {
        assertEquals(r.setAnswer(0), false);
        assertEquals(r.getAnswer(), 5);
        assertEquals(r.setAnswer(6), true);
        assertEquals(r.getAnswer(), 6);
    }

}
