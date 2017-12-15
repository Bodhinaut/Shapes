
/**
 * Kyle M. Shive 
 */
public class Cube extends Rectangle implements Shape3D  {
    protected double height;

    public Cube (double width, double length, double height) {
        super(width, length);
        this.setType("Cube");
        setHeight(height);
    }// end ctr
    
    public final double getHeight () {return height;} // end get height 
    
    public final void setHeight (double height) {
        if (height < 0) {
            System.out.println("Value could not be updated due to negative double.");
        }else
            this.height = height;
    }// end set height 
    
    @Override
    public double volume () {
        return super.area() * height;
    } // end volume method
    
     @Override
    public String toString() {
        String str = "";
        
        str += String.format("%10s", "Cube:") + " ";
        str += "width: " + String.format("%.1f", width) + ", " + "length: " + String.format("%.1f", length);
        str += ", " + "area: " + String.format("%.2f", area() ) + ", ";
        str += "perimeter: " + String.format("%.2f", perimeter() );
        str += ", height: " + String.format("%.1f", height );
        str += ", volume: " + String.format("%.1f", volume() );
        
        return str;
    }// end descriptor 
}// end cube class 
