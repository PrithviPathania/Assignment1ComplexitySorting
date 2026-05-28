package shapes;

import appDomain.Shape;

public class Pyramid extends Shape
{
    private double side;

    /**
     * Calculates the base area of the pyramid.
     * @return the base area (side squared).
     */
    @Override
    public double calcBaseArea() {
       
        return side * side;
    }

    /**
     * Calculates the volume of the pyramid.
     * @return the volume (1/3 * base area * height).
     */
    @Override
    public double calcVolume() {
        return (1/3) * this.calcBaseArea() * getHeight();
    }

}
