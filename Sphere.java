
/**
 * Kyle M. Shive 
 */
public class Sphere extends Circle implements Shape3D {
    public Sphere(double radius) {
        super(radius);
        this.setType("Sphere");
    } // end ctr
    
    @Override 
    public double area() {
        return super.area() * 4;
    }// end surface area method
    
    @Override 
    public double volume() {
        double vol;
        double radius = getRadius();
        double diameter = (radius * 2.0);
        vol = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        return vol;
        //return (4/3) * super.area() * radius;
        //return (Double)((4*22*getRadius()*getRadius()*getRadius() )/(3*7));
        //return (4*22*radius * radius * radius )/(3*7);
        //return ( (4/3) * (Math.pow(getRadius(), 3) ) / (Math.PI) );
        //return (getRadius() * getRadius() * getRadius() ) * (Math.PI) * (4/3);
        //return ( super.area() * getRadius() ) * (4/3);
    }// end sphere volume
    
     @Override
    public String toString() {
        String str = "";
        
        str += String.format("%10s", "Sphere:") + " ";
        str += "radius: " + String.format("%.1f", radius) + ", ";
        str += "area: " + String.format("%.2f", area() ) + ", ";
        str += "circumference: " + String.format("%.2f", circumference() );
        str += ", volume: " + String.format("%.1f", volume() );
        
        return str;
    }// end descriptor 
    
} // end class sphere
