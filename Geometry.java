
/**
 * Geometry Class
 * 
 * @author (Bradley Cookson) 
 * @version (3/18/16)
 */
public class Geometry
{
    private static final double PI = 3.14159;
    private static double radius;
    private static double recLength;
    private static double recWidth;
    private static double triBase;
    private static double triHeight;
    
    /**
     * Constructor for objects of class Geometry that initialize the values to 0.
     */
    public Geometry()
    {
        radius = recLength = recWidth = triBase = triHeight = 0;
    }

    public static double getCircleArea(double radius)
    {
        if(radius < 0) 
        {
            System.out.println("Error: Negative Value"); 
            return 0;
        } else {
            return PI * (radius * radius);
        }
    }
    
    public static double getRectangleArea(double recLength, double recWidth) 
    {
        if(recLength < 0 || recWidth < 0) 
        {
            System.out.println("Error: Negative Value"); 
            return 0;
        } else {
            return recLength * recWidth;
        }
    }
    
    public static double getTriangleArea(double triBase, double triHeight) 
    {
        if(triBase < 0 || triHeight < 0) 
        {
            System.out.println("Error: Negative Value"); 
            return 0;
        } else {
            return (triBase * triHeight)/2;
        }
    }
}
