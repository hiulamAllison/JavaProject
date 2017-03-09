import java.util.Scanner;
import java.awt.*;
import java.awt.geom.*;
/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Circle extends Shape implements Drawable
{
    // instance variables - replace the example below with your own
    private float radius;
     private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;
    /**
     * Constructor for objects of class Circle
     */
    public Circle()
    {this(1.0f);
        xPosition = 20;
        yPosition = 20;
        color = "blue";
        isVisible = true;
   }
    
    public Circle(float r)
    {
     this.radius = r;
     
    }

    public void readShape(){
       Scanner input = new Scanner(System.in);
       System.out.print("Please input the radius:"); 
       radius = input.nextFloat();
        
    }
     
    public void computeArea(){
        area = (float) (Math.PI*radius*radius);
    }
    
   public void computePerimeter(){
        perimeter =  (float) (Math.PI*radius*2);
    }
     
    public void displayShape(){
     System.out.println( "Area of Circle = " + area);
     System.out.println( "Perimeter of Circle = " + perimeter);
        
    }
   
    
    public void draw(){
     if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, color, new Ellipse2D.Float(xPosition, yPosition, 
                                                          this.radius*2, this.radius*2));
                                                          
            canvas.wait(10);
        }
    }
    
    
}