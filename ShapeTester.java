import java.util.Scanner;
public class ShapeTester 
{
   public static void main(String[] args) {
        
      boolean x=true;
       while(x=true)
       {
        System.out.println();
          
           for(int i = 0; i< 38; i++)
        { System.out.print("*");
        }
        System.out.println("");
        System.out.println("*Please choose one of the followings  *"); 
        System.out.println("* Press 'c' - Circle                  *"); 
        System.out.println("* Press 's' - Square                  *"); 
        System.out.println("* Press 'r' - Rectangle               *"); 
        System.out.println("* Press 'x' - EXIT                    *"); 
         for(int i = 0; i< 38; i++)
        { System.out.print("*");}
        
        System.out.println();
        
        Scanner scanner = new Scanner(System.in);
        String choice;
        choice = scanner.nextLine();
       switch(choice)
        {
            case "c": 
            Shape circle = new Circle();
            circle.readShape();
            circle.computeArea();
            circle.computePerimeter();
            circle.displayShape();
            circle.draw();
            break;
            
            
            case "s" : 
            Shape square = new Square();
            square.readShape();
            square.computeArea();
            square.computePerimeter();
            square.displayShape();
            square.draw();
            
            break;
            
            case "r" : 
            Shape rectangle = new Rectangle();
            rectangle.readShape();
            rectangle.computeArea();
            rectangle.computePerimeter();
            rectangle.displayShape();
            rectangle.draw();
            break;
            
            case"x" :
            System.exit(0);
            x=false;
           
            break;
            
            default:System.out.println("Invalid command!");
            
            break;

    
    }
   

}
}
}
