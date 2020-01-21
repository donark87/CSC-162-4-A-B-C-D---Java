public class PassFailExam extends PassFailActivity
{
    private int numQuestions;
    private double pointsEach;
    private int numMissed;


    public PassFailExam(int numQuestions, int numMissed,
                        double minPassing)
    {

        super(minPassing);

        // Declare a local variable for the numeric score.
        double numericScore;


        this.numQuestions = numQuestions;
        this.numMissed = numMissed;


        pointsEach = 100.0 / numQuestions;
        numericScore = 100.0 - (numMissed * pointsEach);

        setScore(numericScore);
    }


    public double getPointsEach()
    {
        return pointsEach;
    }



    public int getNumMissed()
    {
        return numMissed;
    }
}