import java.util.Scanner;
import java.awt.*;
/**
 * Write a description of class Square here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Square extends Shape implements Drawable

{
    
    private float length;
    private String color;
     private int xPosition;
    private int yPosition;
    
    private boolean isVisible;
   
    /**
     * Constructor for objects of class Rectangle
     */
    public Square ()
    {
        this(1.0f);
         xPosition = 150;
        yPosition = 150;
        color = "blue";
        isVisible = true;
        
    }
    
    public Square(float l)
    {  
       this.length = l;
        
    }
   
   
    
    public void readShape(){ 
        System.out.print("Please input the length:");
            Scanner input= new Scanner(System.in);
            length = input.nextFloat();
           
        }
    
    public void computeArea(){
        area = (float)length*length;
    }
    
    public void computePerimeter(){
        perimeter =  (float)4*(length);
        }
        
     public void displayShape(){
         System.out.println( "Area of Square = " + area );
         System.out.println( "Perimeter of Square = " + perimeter);
         
         }
     public void draw(){
        { if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, color,
                        new java.awt.Rectangle(xPosition, yPosition, (int)length,(int)length));
                        
            canvas.wait(10);
        }
        
}
}
}
