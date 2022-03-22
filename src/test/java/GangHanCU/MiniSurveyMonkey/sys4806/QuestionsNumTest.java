package GangHanCU.MiniSurveyMonkey.sys4806;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class QuestionsNumTest {
    QuestionNum q = new QuestionNum ("Test", 1 , 9) ;
    RangeResponses r = new RangeResponses(5, q);
    RangeResponses r2 = new RangeResponses(10, q);

    @Test
    void testAddResponseRangeResponse() {
        assertEquals(q.addResponse(r), true);
        assertEquals(q.addResponse(r2), false);

    }

    @Test
    void testSetMin() {
        q.setMin(6);
        assertEquals(q.getMin(), 6);
    }

    @Test
    void testGetMin() {
        assertEquals(q.getMin(), 1);
    }

    @Test
    void testSetMax() {
        q.setMax(6);
        assertEquals(q.getMax(), 6);
    }

    @Test
    void testGetMax() {
        assertEquals(q.getMax(), 9);
    }
}
