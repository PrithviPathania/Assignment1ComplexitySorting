package appDomain;

/**
 * Represents an abstract Prism shape.
 * All prisms have a height and a side length.
 * 
 * @author Dmytro
 */


abstract public class Prism extends Shape {
    /** The length of the side of the prism's base. */
    private double side;
    
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }

}
