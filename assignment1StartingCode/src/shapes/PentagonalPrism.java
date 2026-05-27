package shapes;



/**
 * Represents a Pentagonal Prism.
 * 
 * @author Dmytro
 */

public class PentagonalPrism extends appDomain.Prism
{
    /**
     * Calculates the base area.
     * @return the base area.
     */
    public double calcBaseArea() {
        double side =  this.getSide();
        // (5*s^2*tan(54))/4
        return (5 * side * side * Math.tan((0.3 * Math.PI))) / 4;
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
