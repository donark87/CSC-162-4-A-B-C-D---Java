//Donark Patel
//CSC 162-C1
//Date: 6/13/2018
//Lab 4B
//This application helps to calculate grades.

public class GradedActivity {
    private double score;

    public GradedActivity()
    {
        score = 0;
    }
    public GradedActivity(double score)
    {
        this.score = score;
    }

    public double getScore()
    {
        return score;
    }

    public void setScore(double score)
    {
        this.score = score;
    }

    public char getGrade()
    {

        char letterGrade;

        if (score >= 90)
            letterGrade = 'A';
        else if (score >= 80)
            letterGrade = 'B';
        else if (score >= 70)
            letterGrade = 'C';
        else if (score >= 60)
            letterGrade = 'D';
        else
            letterGrade = 'F';

        return letterGrade;
    }

}
