/**
 * Write a description of class Shape here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Shape implements Drawable
{
    // instance variables - replace the example below with your own
    protected float area;
    protected float perimeter;
    /**
     * Constructor for objects of class Shape
     */
   
    // To read the shape information from users
    abstract public void readShape();
 
    // To compute the shape’s area
    abstract public void computeArea();
        

     // To computer the shape’s perimeter
    abstract public void computePerimeter();
    
     // To display the area and perimeter of the shape
     abstract public void displayShape();
        
}
