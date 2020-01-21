public class FinalExam extends GradedActivity

{
    private int numQuestions;  // Number of questions
    private double pointsEach; // Points for each question
    private int numMissed;     // Number of questions missed


    public FinalExam(int numQuestions, int numMissed)
    {
        super();
        double numericScore; // To hold the numeric score


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


    public boolean equals(GradedActivity g)
    {
        boolean status; // Result of comparison

        if (this.getScore() == g.getScore())
            status = true;
        else
            status = false;

        return status;
    }



    public boolean isGreater(GradedActivity g)
    {
        boolean status; // Result of comparison

        if (this.getScore() > g.getScore())
            status = true;
        else
            status = false;

        return status;
    }



    public boolean isLess(GradedActivity g)
    {
        boolean status; // Result of comparison

        if (this.getScore() < g.getScore())
            status = true;
        else
            status = false;

        return status;
    }
}