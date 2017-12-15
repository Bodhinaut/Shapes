
/**
 * Kyle M. Shive 
 */
public class Rectangle extends Shape {
    protected double width;
    protected double length;
    
    public Rectangle(double width, double length) {
        super("Rectangle");
        setWidth(width);
        setLength(length);
    }// end ctr 
    
    public final double getWidth  () {return width; }
    public final double getLength () {return length;}
    
    public final void setWidth (double width) {
        if (width < 0) {
            System.out.println("Value could not be updated due to negative double.");
        }else
            this.width = width;
    }// end width setter 
    
    public final void setLength (double length) {
        if (length < 0) {
            System.out.println("Value could not be updated due to negative double.");
        }else
            this.length = length;
    }// end length setter 
    
    @Override
    public double area() {
        return length * width;
    }// end area method
    
    public double perimeter() {
        return 2 * (length + width);
    }// end perimeter method 
    
    @Override
    public String toString() {
        String str = "";
        
        str += String.format("%10s", "Rectangle:") + " ";
        str += "width: " + String.format("%.1f", width) + ", " + "length: " + String.format("%.1f", length);
        str += ", " + "area: " + String.format("%.2f", area() ) + ", ";
        str += "perimeter: " + String.format("%.2f", perimeter() );
    
        return str;
    }// end descriptor 
    
}// end rect class 
