//Donark Patel
//CSC 162-C1
//Date: 6/13/2018
//Lab 4B
//This application helps to calculate grades.

public class PassFailExam extends PassFailActivity
{
    private int numQuestion;
    private int numMissedQuestion;
    private double minimumPassScore;
    private double pointsEach;

    public PassFailExam()
    {
        super();
        numMissedQuestion = 0;
        numQuestion = 0;
        minimumPassScore = 0;
        pointsEach = 0;
    }

    public PassFailExam(int numQuestion, int numMissedQuestion, double minimumPassScore)
    {
        super();
        this.numQuestion = numQuestion;
        this.numMissedQuestion = numMissedQuestion;
        this.minimumPassScore = minimumPassScore;
        pointsEach = getPointsEach();
        setScore(100 - (numMissedQuestion * pointsEach));
    }

    public PassFailExam(double minimumPassScore, int numQuestion, int numMissedQuestion, double minimumPassScore1)
    {
        super(minimumPassScore);
        this.numQuestion = numQuestion;
        this.numMissedQuestion = numMissedQuestion;
        this.minimumPassScore = minimumPassScore1;
        pointsEach = getPointsEach();
        setScore(100 - (numMissedQuestion * pointsEach));
    }

   /* public PassFailExam(double score, double minimumPassScore, int numQuestion, int numMissedQuestion, double minimumPassScore1)
    {
        super(score, minimumPassScore);
        this.numQuestion = numQuestion;
        this.numMissedQuestion = numMissedQuestion;
        this.minimumPassScore = minimumPassScore1;
    }*/
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
