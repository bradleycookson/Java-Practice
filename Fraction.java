
/**
 * Fraction Class
 * 
 * @author (Bradley Cookson)
 * @version (3/18/16)
 */
public class Fraction
{
    // instance variables - replace the example below with your own
    private int n1;
    private int n2;
    private int numerator;
    private int d1;
    private int d2;
    private int denominator;
    private int r;
    private int gcd;
    private double sum;
    private double difference;
    private double product;
    private double quotient;
    private double fraction1;
    private double fraction2;

    /**
     * Constructor for objects of class Fraction
     */
    public Fraction()
    {
        // initialise instance variables
        n1 = n2 = d1 = d2 = 0;
        gcd = 0;

    }

    public int getGCD(int d1, int d2)
    {
        if (d1 < d2)
        {
            r = d2 % d1;

            if (r == 0) 
            {
                gcd = d1;
            } else 
            {
                do 
                {
                    d1--;
                    r = d2 % d1;
                } while (r != 0);
                gcd = d1;
            }
        } else if (d2 < d1) 
        {
            r = d1 % d2;

            if (r == 0) 
            {
                gcd = d2;
            } else 
            {
                do 
                {
                    d2--;
                    r = d1 % d2;
                } while (r != 0);
                gcd = d2;
            }
        }
        return gcd;
    }

    public void getSum(int n1, int n2, int d1, int d2, double sum) 
    {
        if (d1 == d2) 
        {
            numerator = n1 + n2;
            denominator = d1;
        } else if (d1 != d2) 
        {
            denominator = getGCD(d1, d2);
            numerator = (n1 * d2) + (n2 * d1);
        }
        System.out.println("The sum is: "+numerator+"/"+denominator+".");
    }

    public void getDiff(int n1, int n2, int d1, int d2, double difference) 
    {
        if (d1 == d2) 
        {
            numerator = n1 - n2;
            denominator = d1;
        } else if (d1 != d2) 
        {
            denominator = getGCD(d1, d2);
            numerator = (n1 * d2) - (n2 * d1);
        }
        System.out.println("The difference is: "+numerator+"/"+denominator+".");

    }

    public void getProduct(int n1, int n2, int d1, int d2, double product)
    {
        numerator = (n1*n2);
        denominator = (d1*d2);

        System.out.println("The product is: "+numerator+"/"+denominator+".");
    }

    public void getQuotient(int n1, int n2, int d1, int d2, double quotient)
    {
        numerator = (n1*d2);
        denominator = (n2*d1);

        System.out.println("The quotient is: "+numerator+"/"+denominator+".");

    }
    
    public void getCompare(int n1, int n2, int d1, int d2) 
    {
        fraction1 = n1/d1;
        fraction2 = n2/d2;
        
        if (fraction1 < fraction2) 
        {
            System.out.println("Fraction 2 is greater than Fraction 1.");
        } else if (fraction2 < fraction1) 
        {
            System.out.println("Fraction 1 is greater than Fraction 2.");
        }
    } 
    
    public double getDecimal(int n1, int d1) 
    {
        return n1/d1;
    }
}

