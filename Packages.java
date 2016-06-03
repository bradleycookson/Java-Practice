
/**
 * A class that defines ISP service packages available to all customers.
 * This class contains all of the relevant fields to create an instance
 * of a customer package and contains a methods to construct the object,
 * set the relevant fields, and calculate the users final bill.
 * 
 * @author (Bradley Cookson) 
 * @version (2/11/16)
 */
public class Packages
{
    // Instance variables
    private final double costA;
    private final double costB;
    private final double costC;
    private final double hoursA;
    private final double hoursB;
    private final double additionalCostA;
    private final double additionalCostB;
    private int userPackage;
    private double hours;

    /**
     * Constructor for objects of class Packages
     */
    public Packages()
    {
        costA = 25.99;
        costB = 35.95;
        costC = 49.00;
        hoursA = 25;
        hoursB = 45;
        additionalCostA = 0.48;
        additionalCostB = 0.65;
        userPackage = 0;
        hours = 0;
    }
    
    /**
     * Set method for the user's package type
     * @param int - the value to change the userPackage field
     */ 
    public void setPackage(int inPackage) 
    {
        userPackage = inPackage;
    }
    
    /**
     * Set method for the user's hours during the billing period
     * @param double - the value to change the hours field
     */
    public void setHours(double inHours) 
    {
        hours = inHours;
    }
    
    /**
     * Get method to calculate the user's bill.  
     * @return double - a value for the user's total bill
     */
    public double getBill( ) 
    {
        double totalBill = 0;
        
        switch (userPackage) 
        {
            case 1:
                if (hours <= hoursA) 
                {
                    totalBill = costA;
                }
                else 
                {
                    totalBill = costA + ((hours - hoursA) * additionalCostA);
                }
            break;
            case 2:
                if (hours <= hoursB) 
                {
                    totalBill = costB;
                }
                else
                {
                    totalBill = costB + ((hours - hoursB) * additionalCostB);
                }
            break;
            case 3:
                {
                    totalBill = costC;
                }
            break;
        }
        
        return totalBill;
    }
}

