package shapes;

import appDomain.Shape;

public class Cylinder extends Shape
{
    private double radius;

    @Override
    public double calcBaseArea() {
       
        return Math.PI * radius * radius;
    }
    @Override
    public double calcVolume() {
        return this.calcBaseArea() * this.getHeight();
    }

}
