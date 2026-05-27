package shapes;

import appDomain.Shape;

public class Cone extends Shape
{
    private double radius;
   @Override
   public double calcBaseArea() {
       return Math.PI * radius;
   }
   @Override
   public double calcVolume() {
        return 1/3 * Math.PI * radius * radius * this.getHeight();
   }

}
