//Donark Patel
//CSC 162-C1
//Date: 6/13/2018
//Lab 4B
//This application helps to calculate grades.

public class CourseGradesDemo {
    public static void main(String [] args)
    {
        GradedActivity ga1 = new GradedActivity(85);
        PassFailExam pfe1 = new PassFailExam(20,3,70);
        Essay es1 = new Essay(25,18,17,20);
        FinalExam fe1 = new FinalExam(50,10);
        CourseGrades cg1 = new CourseGrades(fe1,pfe1,ga1,es1);

        System.out.print(cg1.toString());
    }
}
