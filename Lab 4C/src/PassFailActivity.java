//Donark Patel
//CSC 162-C1
//Date: 6/13/2018
//Lab 4C
//This application helps to calculate grades.

public class PassFailActivity extends GradedActivity
{
    private double minimumPassScore;

    public PassFailActivity()
    {
        super();
        minimumPassScore = 0;
    }

    public PassFailActivity(double minimumPassScore)
    {
        super();
        this.minimumPassScore = minimumPassScore;
    }

    public PassFailActivity(double score, double minimumPassScore) {
        super(score);
        this.minimumPassScore = minimumPassScore;
    }
    public char getGrade()
    {
        char letterGrade;

        if (super.getScore() >= minimumPassScore)
            letterGrade = 'P';
        else
            letterGrade = 'F';

        return letterGrade;
    }
}
