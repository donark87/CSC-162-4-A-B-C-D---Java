//Donark Patel
//CSC 162-C1
//Date: 6/13/2018
//Lab 4B
//This application helps to calculate grades.

import java.text.DecimalFormat;

public class CourseGrades {
    private FinalExam classFinal;
    private PassFailExam classPassFailExam;
    private GradedActivity classLab;
    private Essay classEssay;
    private GradedActivity[] grades = {classLab, classPassFailExam, classEssay, classFinal};

    public CourseGrades(FinalExam classFinal, PassFailExam classPassFailExam, GradedActivity classLab, Essay classEssay)
    {
        this.classFinal = classFinal;
        this.classPassFailExam = classPassFailExam;
        this.classLab = classLab;
        this.classEssay = classEssay;
    }

    public void setClassFinal(FinalExam classFinal)
    {
        this.classFinal = classFinal;
    }

    public void setClassPassFailExam(PassFailExam classPassFailExam)
    {
        this.classPassFailExam = classPassFailExam;
    }

    public void setClassLab(GradedActivity classLab)
    {
        this.classLab = classLab;
    }

    public void setClassEssay(Essay classEssay)
    {
        this.classEssay = classEssay;
    }
    public String toString()
    {
        DecimalFormat df1 = new DecimalFormat("0.0");
        return "" +
                "\nEssay\nScore: " + df1.format(classEssay.getScore()) +"\nLetter Grade: "+ classEssay.getGrade() +
                "\n\nFinal Exam\nScore: " + df1.format(classFinal.getScore()) +"\nLetter Grade: "+  classFinal.getGrade() +
                "\n\nPass Fail Exam\nScore: " + df1.format(classPassFailExam.getScore()) +"\nLetter Grade: "+ classPassFailExam.getGrade() +
                "\n\nLab\nScore: " + df1.format(classLab.getScore()) +"\nLetter Grade: "+ classLab.getGrade() +"\n";

    }
}