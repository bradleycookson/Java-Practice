
/**
 * This program calculates the pay for an hourly employee.
 * 
 * @author (Bradley Cookson)
 * @version (2/10/16)
 */
public class Employee
{
    private String employeeName;
    private double hourlyPay;
    private int employeeHours;
    private boolean hasDifferential;
    private final double percent;

    public Employee()
    {
        employeeName = "unknown";
        hourlyPay = 0.0;
        hasDifferential = false;
        percent = .08;
    }
    
    public Employee(String employeeName, double hourlyPay, int employeeHours, boolean hasDifferential, double percent) 
    {
        this.employeeName = employeeName;
        this.hourlyPay = hourlyPay;
        this.employeeHours = employeeHours;
        this.hasDifferential = hasDifferential;
        this.percent = percent;
    }

    public double finalPay(int employeeHours, double hourlyPay, boolean hasDifferential, double percent)
    {
        double pay = 0;
        
        if (hasDifferential == false) 
        {
            pay = employeeHours * hourlyPay;
        } 
        else if (hasDifferential == true) 
        {
            pay = (employeeHours * hourlyPay) * (1 + percent);
        }
        return pay;
    }
    
    public String getName() 
    {
        return employeeName;
    }
    
    public double getPay() 
    {
        return hourlyPay;
    }
    
    public boolean getDiff() 
    {
        return hasDifferential;
    }
    
    public double getPercent() 
    {
        return percent;
    }
    
    public void setName(String inName) 
    {
        employeeName = inName;
    }
    
    public void setPay(double inPay) 
    {
        hourlyPay = inPay;
    }
    
    public void setHours(int inHours) 
    {
        employeeHours = inHours;
    }
    
    public void setDiff(boolean inDiff) 
    {
        hasDifferential = inDiff;
    }
    
}
