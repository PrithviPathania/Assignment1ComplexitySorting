package shapes;

import appDomain.Shape;

public class Pyramid extends Shape
{
    private double side;

     @Override
    public double calcBaseArea() {
       
        return side * side;
    }
    @Override
    public double calcVolume() {
        return (1/3) * this.calcBaseArea() * getHeight();
    }

}
