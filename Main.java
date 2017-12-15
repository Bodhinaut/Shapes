import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *  Kyle M. Shive
 */
public class Main {
    private static final int FIELD_TYPE = 0;
    private static final int FIELD_WIDTH = 1;
    private static final int FIELD_LENGTH = 2;
    private static final int FIELD_HEIGHT = 3;
    private static final int FIELD_RADIUS = 1;
    
    private static ArrayList<Shape> shapes;

    public static void main(String[] args) {
      try {
        shapes = new ArrayList<>();
        
        readShapesFromFile("shapesIn.txt"); // read into an arrayList and return 
        writeShapesToFile(shapes,"shapesOut.txt"); //accept arrayList and filename, -- took out arrayList...
        
       
        
      }catch (FileNotFoundException e) {
          System.err.println(e.getMessage() ); 
      }// end try
          System.out.println("Shapes were processed successfully.");
    }// end main method 
    
    public static ArrayList<Shape> readShapesFromFile(String filename) throws FileNotFoundException {
        try(Scanner fin = new Scanner (new File(filename) ); ) {
            String record;
            String[] fields;
            shapes = new ArrayList<>();
        
            while (fin.hasNext() ) {
                record = fin.nextLine();
                fields = record.split(",");
                
                // decide type of shape we are creating 
                if (fields[FIELD_TYPE].equals("r") ) {
                    // create rectangle 
                    shapes.add(new Rectangle( 
                                             Double.parseDouble(fields[FIELD_WIDTH]), 
                                             Double.parseDouble(fields[FIELD_LENGTH])) );
                }else if (fields[FIELD_TYPE].equals("c") ) {
                    //create circle 
                    shapes.add(new Circle(  
                                             Double.parseDouble(fields[FIELD_RADIUS])) );
                }else if (fields[FIELD_TYPE].equals("s") ) {
                    // create sphere
                    shapes.add(new Sphere(   Double.parseDouble(fields[FIELD_RADIUS]) ) );
                
                }else if (fields[FIELD_TYPE].equals("u") ) {
                    //create cube
                    shapes.add(new Cube(     Double.parseDouble(fields[FIELD_WIDTH]), 
                                             Double.parseDouble(fields[FIELD_LENGTH]),
                                             Double.parseDouble(fields[FIELD_HEIGHT]) ) );
                
                }
            
            }// end while loop for read

        }// end try with resources 
            return shapes;
    }// end read method 
    
    public static Shape shapeWithLargestArea(ArrayList<Shape> shapes) {
        Shape largestShape = null;
            for(Shape shape: shapes) {
                if(largestShape == null || shape.area() > largestShape.area() )
                    largestShape = shape;
            }// end forEach
        return largestShape;
    }// end largest area method 
    
    
    public static int countOfShape (String type, ArrayList<Shape> shapes) {
        int shapeCount = 0;
          if (type == "Circle") {
            for (Shape shape: shapes) {
                switch(shape.getType() ) {
                    case "Circle":
                        shapeCount++;
                        break;
                }// end switch case
            }// end for
            return shapeCount;
        } else if (type == "Rectangle") {
            for (Shape shape: shapes) {
                switch(shape.getType() ) {
                    case "Rectangle":
                        shapeCount++;
                        break;
                }// end switch case
            }// end for
            return shapeCount;
        } else if (type == "Sphere") {
             for (Shape shape: shapes) {
                switch(shape.getType() ) {
                    case "Sphere":
                        shapeCount++;
                        break;
                }// end switch case
            }// end for
            return shapeCount;
        } else if (type == "Cube") {
             for (Shape shape: shapes) {
                switch(shape.getType() ) {
                    case "Cube":
                        shapeCount++;
                        break;
                }// end switch case
            }// end for
            return shapeCount;
        }
    
            return shapeCount;
    } // end shape count method
    
    
    public static void writeShapesToFile(ArrayList<Shape> shapes, String filename) throws FileNotFoundException {
        try (PrintWriter pw = new PrintWriter(new File(filename) ); ) {
            for (Shape e: shapes) {
                pw.println(e);
            }// end for each loop
            pw.println(String.format("%n%s","Object with largest area:") );
            pw.println("\t" + shapeWithLargestArea(shapes) );
            pw.printf(String.format("%n%10s","Rectangle count: " + countOfShape("Rectangle",shapes) ) );
            pw.printf(String.format("%n%3s","   Circle count: " + countOfShape("Circle",shapes) ) );
            pw.println();
            pw.printf(String.format("%n%10s","     Cube count: " + countOfShape("Cube",shapes) ) );
            pw.printf(String.format("%n%3s","   Sphere count: " + countOfShape("Sphere",shapes) ) );
        }// end try with resources 
    }// end write method 
    
    
    
}// end main class 
