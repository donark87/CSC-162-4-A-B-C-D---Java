//Donark Patel
//CSC 162-C1
//Date: 6/13/2018
//Lab 4B
//This application helps to calculate grades.

public class Essay extends GradedActivity
{
    private static final double HIGHGRAMMAR = 30.00;
    private static final double HiGHSPELLING = 20.00;
    private static final double HiGHLENGTH = 20.00;
    private static final double HiGHCONTENT = 30.00;

    private double grammar;
    private double spelling;
    private double length;
    private double content;
    public Essay()
    {
        super();
        grammar = 0;
        spelling = 0;
        length = 0;
        content = 0;
    }
    public Essay(double grammar, double spelling, double length, double content)
    {
        super();
        setGrammar(grammar);
        setSpelling(spelling);
        setLength(length);
        setContent(content);


        setScore(getTotal());
    }
    public double getGrammar()
    {
        return grammar;
    }

    private void setGrammar(double grammar)
    {
        if(grammar <= HIGHGRAMMAR)
            this.grammar = grammar;
        else this.grammar = 0.0;
    }

    public double getSpelling()
    {
        return spelling;
    }

    private void setSpelling(double spelling)
    {
        if(spelling <= HiGHSPELLING)
        this.spelling = spelling;
        else this.spelling = 0.0;
    }

    public double getLength()
    {
        return length;
    }

    private void setLength(double length)
    {
        if(length <= HiGHLENGTH)
        this.length = length;
        else this.length = 0.0;
    }

    public double getContent()
    {
        return content;
    }

    private void setContent(double content)
    {
        if(content <= HiGHCONTENT)
        this.content = content;
        else this.content = 0.0;
    }


    public double getTotal()
    {
        return getGrammar() + getSpelling() + getLength() + getContent();
    }
    public String toString()
    {
        return "Grammar: " + getGrammar()
              +"\nSpelling: " + getSpelling()
              +"\nLength: " + getLength()
              +"\nContent: "+ getContent()
              +"\nTotal: " + getTotal()
              +"\nLetter Grade: " + getGrade();
    }

}
