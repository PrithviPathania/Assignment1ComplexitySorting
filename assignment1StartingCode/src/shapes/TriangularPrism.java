package shapes;

/**
 * Represents a Triangular Prism.
 * 
 * @author Prithvi 
 */
public class TriangularPrism extends appDomain.Prism
{
	/**
     * Calculates the base area.
     * @return the base area.
     */
	
	
    public double calcBaseArea() {
    	// ( s^2* sqrt(3) )/4
    	double side = this.getSide();
    	return (side * side * Math.sqrt(3)) / 4;
    	
    }

    /**
     * Calculates the volume.
     * @return the volume.
     */
    
    
    public double calcVolume() {
        // a*h
        return this.calcBaseArea() * this.getHeight();
    }
	
	

}
