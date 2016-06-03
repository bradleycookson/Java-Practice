
/**
 * Write a description of class BowlingScore here.
 * 
 * @author (Bradley Cookson) 
 * @version (2/5/16)
 */
public class BowlingScore
{
    // instance variables - replace the example below with your own
    private String firstName;
    private String lastName;
    private int score1;
    private int score2;
    private int score3;
    private int age;
    private double average;

    /**
     * Constructor for objects of class BowlingScore
     */
    public BowlingScore()
    {
        // initialise instance variables
        firstName = lastName = null;
        score1 = score2 = score3 = 0;
        age = 0;
    }
    
    /**
     * Constructor that expects five values
     */
    public BowlingScore(String fName, String lName, int Score1, int Score2, int Score3, int Age)
    {
        firstName = fName;
        lastName = lName;
        score1 = Score1;
        score2 = Score2;
        score3 = Score3;
        age = Age;
    }

    /**
     * Calc Average methode to find the average of the three scores
     * 
     * @param  s1, s2, s3 the three integer scores
     * @return     the average of x, y, and z
     */
    public void calcAverage(int s1, int s2, int s3)
    {
        // put your code here
        average = (s1 + s2 + s3)/3;
    }
    
    public String getName()
    {
        return firstName + " " + lastName;
    }
    
    public int getAge() 
    {
        return age;
    }
    
    public int getFirstScore() 
    {
        return score1;
    }
    
    public int getSecondScore() 
    {
        return score2;
    }
    
    public int getThirdScore() 
    {
        return score3;
    }
    
    public void setFirstScore(int inScore1) 
    {
        if (inScore1 < 0 || inScore1 > 300)
            score1 = 0;
        else
            score1 = inScore1;
    }
    
     public void setSecondScore(int inScore2) 
    {
        if (inScore2 < 0 || inScore2 > 300)
            score2 = 0;
        else
            score2 = inScore2;
    }
    
     public void setThirdScore(int inScore3) 
    {
        if (inScore3 < 0 || inScore3 > 300)
            score3 = 0;
        else
            score3 = inScore3;   
    }
}
