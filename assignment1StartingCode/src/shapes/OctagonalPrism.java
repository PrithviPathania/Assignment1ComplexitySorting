package shapes;



/**
 * Represents a Octagonal Prism.
 * 
 * @author Dmytro
 */

public class OctagonalPrism extends appDomain.Prism
{
    /**
     * Calculates the base area.
     * @return the base area.
     */
    public double calcBaseArea() {
        double side =  this.getSide();
        // 2*(1 + sqrt(2))side^2
        return 2 * (1 + Math.sqrt(2) * side * side);
    }

    /**
     * Calculates the volume.
     * @return the volume.
     */
    public double calcVolume() {
        // A*h
        return this.calcBaseArea() * this.getHeight();
    }
}
