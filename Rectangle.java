import java.util.Scanner;
import java.awt.*;
public class Rectangle extends Shape implements Drawable
{
    // instance variables - replace the example below with your own
    private float length;
    private float width;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;

    public Rectangle (){
        this(1.0f,1.0f);xPosition = 250;
        yPosition = 250;color = "blue";
        isVisible = true;
    }
    
    public Rectangle(float l, float w)
    { 
        this.length = l;
       this.width = w;
    }
    
     public void readShape(){
       System.out.print("Please input the length:");
            Scanner input = new Scanner(System.in);
             length = input.nextFloat();
            System.out.print("Please input the width:");
            Scanner input1 = new Scanner(System.in);
             width = input1.nextFloat();
    }
    
    public void computeArea(){
        area = (float)(length*width);
    }
    
    public void computePerimeter(){
        perimeter =  (float)(2*(length+width));
        }
        
     public void displayShape(){
         System.out.println( "Area of Rectangle = " + area);
         System.out.println( "Perimeter of Rectangle = " + perimeter);
         
         }
     
  public void draw()
   { if(isVisible) {
    Canvas canvas = Canvas.getCanvas();
    canvas.draw(this, color,
    new java.awt.Rectangle(xPosition, yPosition, (int)length,(int)width));
    canvas.wait(10);}}}
   

