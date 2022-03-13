package Group28.MiniSurveyMonkey;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class QuestionTests {

    @Test
    public void testOpen(){
        OpenQuestion open = new OpenQuestion("Why");
        assert open.getType() == "open";
        assert open.getQuestion() == "Why";

        open.setAnswer("IDK");
        assert open.getAnswer() == "IDK";

        open.setQuestion("BRUH");
        assert open.getQuestion() == "BRUH";
    }

    @Test
    public void testMulti(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        MultiQuestion multi = new MultiQuestion("Why", list, 0);
        assert multi.getType() == "multi";
        assert multi.getQuestion() == "Why";
        assert multi.getAnswers() == list;
        assert multi.getCorrect() == 0;
    }

    @Test
    public void testNumber(){
        NumberQuestion number = new NumberQuestion("Why", 4, 7);
        assert number.getType() == "number";
        assert number.getQuestion() == "Why";
        assert number.getMin() == 4;
        assert number.getMax() == 7;
        assert number.isCorrect(5.6) == true;
    }

}
