package appDomain;

import java.util.Comparator;

public class BaseAreaComparator implements Comparator<Shape> {


    /**
     * Compares its two arguments for order based on base area.
     * 
     * @param o1 the first shape to be compared.
     * @param o2 the second shape to be compared.
     * @return a negative integer, zero, or a positive integer as the first argument 
     *         is less than, equal to, or greater than the second.
     */
    @Override
    public int compare(Shape o1, Shape o2) {
        return Double.compare(o1.calcBaseArea(), o2.calcBaseArea());
    }

}
