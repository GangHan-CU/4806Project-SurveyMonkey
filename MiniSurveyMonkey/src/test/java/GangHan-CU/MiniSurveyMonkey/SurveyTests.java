package Group28.MiniSurveyMonkey;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class SurveyTests {

    @Test
    public void testCreation(){
        Survey survey = new Survey();
        OpenQuestion open = new OpenQuestion("Why");

        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        MultiQuestion multi = new MultiQuestion("Why", list, 0);

        NumberQuestion number = new NumberQuestion("Why", 4, 7);

        survey.addQuestion(open);
        survey.addQuestion(multi);
        survey.addQuestion(number);

        //Test get by index
        assert survey.getQuestionByIndex(0) == open;
        assert survey.getQuestionByIndex(1) == multi;
        assert survey.getQuestionByIndex(2) == number;
        assert survey.getSurveyClosed() == true;
        assert survey.getEditable() == true;
    }

    @Test
    public void testPublishing(){
        Survey survey = new Survey();
        OpenQuestion open = new OpenQuestion("Why");

        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        MultiQuestion multi = new MultiQuestion("Why", list, 0);

        NumberQuestion number = new NumberQuestion("Why", 4, 7);

        survey.addQuestion(open);
        survey.addQuestion(multi);
        survey.addQuestion(number);

        survey.publishSurvey();

        assert survey.getSurveyClosed() == false;
        assert survey.getEditable() == false;

    }
}
