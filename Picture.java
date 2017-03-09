import java.util.ArrayList;
import java.util.Iterator;

public class Picture{
    
    private ArrayList<Shape> shapes;
    public Picture()
    { shapes = new ArrayList<Shape>();}
   public void addShape(Shape s)
   { shapes.add(s);}
   
    public void computeShape()
     {
       for(Iterator iter = shapes.iterator(); iter.hasNext(); )
        {Shape s = (Shape)iter.next();
         s.computeArea();
         s.computePerimeter();} }
   public void listAllShapeTypes(){
     for(Iterator iter = shapes.iterator(); iter.hasNext(); )
        { Shape s = (Shape)iter.next();
            s.displayShape(); }}
  public void listSingleShapeType(String className){
   for(Iterator iter = shapes.iterator(); iter.hasNext(); )
        { Shape s = (Shape)iter.next();
           int j = 0;
           if( className == "Circle"){
              if (s instanceof Circle){
               s.displayShape();} }
             else if(className == "Square"){
               if (s instanceof Square){
               s.displayShape();} }
            else if(className =="Rectangle"){
              if (s instanceof Rectangle){
               s.displayShape(); } }} } }
    
