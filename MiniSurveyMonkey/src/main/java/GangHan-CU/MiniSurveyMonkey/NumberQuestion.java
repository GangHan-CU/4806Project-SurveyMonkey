package Group28.MiniSurveyMonkey;

public class NumberQuestion extends Question{
    private double min;
    private double max;

    public NumberQuestion(String question, double min, double max){
        super.type = "number";
        super.question = question;
        this.min = min;
        this.max = max;
    }

    public boolean isCorrect(double answer){
        return (answer >= min && answer <= max);
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }
}
