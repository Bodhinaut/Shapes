
/**
 * Kyle M. Shive 
 */
public abstract class Shape {
    protected String type;
    
    public Shape (String type) {
        setType(type);
    }// end ctr
    
    public final String getType ()            {return type;     }
    public final void setType   (String type) {this.type = type;}
    
    public abstract double area (); // end prototype
    
    public double getArea () {return area();}
    
    @Override
    public String toString() {
        String str = "";
        
        str += type;
    
        return str;
    }// end descriptor 
    
}// end shape class
