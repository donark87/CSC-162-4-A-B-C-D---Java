//Donark Patel
//CSC 162-C1
//Date: 6/13/2018
//Lab 4B
//This application helps to calculate grades.


public class FinalExam extends GradedActivity {
    private int numQuestion;
    private int numMissedQuestion;
    private double pointsEach;

    public FinalExam(int numQuestion, int numMissedQuestion) {
        this.numQuestion = numQuestion;
        this.numMissedQuestion = numMissedQuestion;
        pointsEach = getPointsEach();
        setScore(100 - (numMissedQuestion * pointsEach));
    }

    /*public FinalExam(double score, int numQuestion, int numMissedQuestion) {
        super(score);
        this.numQuestion = numQuestion;
        this.numMissedQuestion = numMissedQuestion;
        pointsEach = getPointsEach();
    }*/

    public void setNumQuestion(int numQuestion) {
        this.numQuestion = numQuestion;
    }

    public double getPointsEach() {
        double numericScore;
        numericScore = 100 / this.numQuestion;

        return numericScore;
    }

    public int getNumMissedQuestion()
    {
        return numMissedQuestion;
    }
}
