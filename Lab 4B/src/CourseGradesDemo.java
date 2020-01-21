public class CourseGradesDemo {
    public static void main(String [] args)
    {
        GradedActivity ga1 = new GradedActivity(85);
        PassFailExam pfe1 = new PassFailExam(20,3,70);
        Essay es1 = new Essay(25,18,17,20);
        FinalExam fe1 = new FinalExam(50,10);
        CourseGrades cg1 = new CourseGrades();
    }
}
