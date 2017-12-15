
/**
 * Kyle M. Shive 
 */
public class Circle extends Shape {
    protected double radius;
    
    public Circle (double radius) {
        super("Circle");
        setRadius(radius);
    }//end ctr
    
    public final double getRadius () {return radius;}
    
    public final void setRadius (double radius) {
        if (radius < 0) {
            System.out.println("Value could not be updated due to negative double.");
        }else 
            this.radius = radius;
    }// end radius setter 
    
    @Override
    public double area() {
        return (Math.PI * radius * radius );
    }// end method area
    
    public double circumference () {
        return Math.PI * 2 * getRadius();
    }// end circumference method 
    
    @Override
    public String toString() {
        String str = "";
        
        str += String.format("%10s", "Circle:") + " ";
        str += "radius: " + String.format("%.1f", radius) + ", ";
        str += "area: " + String.format("%.2f", area() ) + ", ";
        str += "circumference: " + String.format("%.2f", circumference() );
    
        return str;
    }// end descriptor 
}// end circle class 
