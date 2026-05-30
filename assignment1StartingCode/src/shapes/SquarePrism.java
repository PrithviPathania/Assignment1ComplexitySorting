package shapes;


/**
 * Represents a Square Prism.
 * 
 * @author Prithvi 
 */

public class SquarePrism extends appDomain.Prism
{ /**
     * Calculates the base area.
     * @return the base area.
     */
	
	//s^2
    public double calcBaseArea() {
	   return this.getSide() * this.getSide();
    }

    /**
     * Calculates the volume.
     * @return the volume.
     */
    
    
    public double calcVolume() {
        // s^2*h
        return this.calcBaseArea() * this.getHeight();
    }

}
