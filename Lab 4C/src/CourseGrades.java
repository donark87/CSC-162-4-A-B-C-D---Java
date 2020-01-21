//Donark Patel
//CSC 162-C1
//Date: 6/13/2018
//Lab 4C
//This application helps to calculate grades.

public class CourseGrades implements Analyzable
{
    private GradedActivity[] grades;
    private static int NUM_GRADES = 4;

    public CourseGrades()
    {
        grades = new GradedActivity[NUM_GRADES];
    }

    //Values for each grade is assigned to the array

    public void setLab(GradedActivity aLab)
    {
        grades[0] = aLab;
    }

    public void setPassFailExam(PassFailExam aPassFailExam)
    {
        grades[1] = aPassFailExam;
    }

    public void setEssay(Essay anEssay)
    {
        grades[2] = anEssay;
    }

    public void setFinalExam(FinalExam aFinalExam)
    {
        grades[3] = aFinalExam;
    }



    //What is printed on window.
    public String toString()
    {
        String result;

        result = "\nLab\nScore: " + grades[0].getScore() + "\nLetter Grade: " + grades[0].getGrade() + "\n\nPass Fail Exam\nScore: "
                + grades[1].getScore() + "\nGrade: " + grades[1].getGrade()
                + "\n\nEssay\nScore: " + grades[2].getScore() + "\nGrade: " + grades[2].getGrade()
                + "\n\nFinal Exam\nScore: " + grades[3].getScore() + "\nGrade: " + grades[3].getGrade();/* + "\n\nAverage Score: " + getAverage()
                + "\n\nHighest Score: " + getHighest() + "\n\nLowest Score: " + g.getLowest();*/
        return result;
    }
    public double getAverage()
    {
        double sum = 0.0;

        for(GradedActivity g : grades)
        {
            sum += g.getScore();
        }

        return sum/grades.length;
    }
    public GradedActivity getHighest()
    {
        double max = Double.MIN_VALUE;
        GradedActivity output = null;

        for(GradedActivity g : grades)
        {
            if(g.getScore() > max)
            {
                output = g;
                max = g.getScore();
            }
        }

        return output;
    }
    public GradedActivity getLowest()
    {
        double min = Double.MAX_VALUE;
        GradedActivity output = null;

        for(GradedActivity g : grades)
        {
            if(g.getScore() < min)
            {
                output = g;
                min = g.getScore();
            }
        }

        return output;
    }
}