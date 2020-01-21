public class PassFailActivity extends GradedActivity
{
    private double minPassingScore;
    public PassFailActivity()
    {
        super();
        minPassingScore = 0;
    }

    public PassFailActivity(double minPassingScore)
    {
        super();
        this.minPassingScore = minPassingScore;
    }



    public char getGrade()
    {
        char letterGrade;

        if (super.getScore() >= minPassingScore)
            letterGrade = 'P';
        else
            letterGrade = 'F';

        return letterGrade;
    }
}