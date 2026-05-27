package appDomain;



/**
 * Represents an abstract Shape.
 * All shapes have a height and can calculate their volume and base area.
 * 
 * @author Dmytro
 */


abstract public class Shape implements Comparable<Shape> {
    /** The height of the shape. */
    private double height;
    public double calcVolume() {
        return 1;
    }
    public double calcBaseArea() {
        return 1;
    }


    // Shapes are compared by their height.
    @Override
    public int compareTo(Shape s){
		if ( this.getHeight() > s.getHeight() ) return 1;
		else if ( this.getHeight() < s.getHeight() ) return -1;
		else return 0;
	}

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
