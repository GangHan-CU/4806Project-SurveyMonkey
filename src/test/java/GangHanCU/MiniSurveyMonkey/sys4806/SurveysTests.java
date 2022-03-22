package GangHanCU.MiniSurveyMonkey.sys4806;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class SurveysTests {
    Surveys survey = new Surveys("SurveyTest");
    List<Questions> questions = new ArrayList<>();
    Questions question1 = new QuestionText();
    Questions question2 = new QuestionText();

    @Test
    public void isEmpty(){
        assertEquals(0, survey.size());
    }

    @Test
    public void isClosed(){
        assertFalse(survey.getClosed());
    }

    @Test
    public void getName(){
        assertEquals("SurveyTest", survey.getName());
    }

    @Test
    public void addQuestion(){
        survey.addQuestion(question1);
        assertEquals(survey.getQuestions().get(0), question1);
    }

    @Test
    public void removeQuestion(){
        survey.removeQuestion(question1);
        assertEquals(0, survey.size());
    }

    @Test
    public void setQuestions(){
        questions.add(question1);
        questions.add(question2);
        survey.setQuestions(questions);
        assertEquals(questions, survey.getQuestions());
    }

    @Test
    public void close(){
        survey.setClosed();
        assertTrue(survey.getClosed());
    }

}
