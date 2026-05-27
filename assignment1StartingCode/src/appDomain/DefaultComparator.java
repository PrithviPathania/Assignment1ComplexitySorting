package appDomain;

import java.util.Comparator;

public class DefaultComparator implements Comparator<Shape> {

    /**
     * Compares two Shape objects using their natural ordering.
     * 
     * @param o1 the first shape to be compared.
     * @param o2 the second shape to be compared.
     * @return a negative integer, zero, or a positive integer as the first argument 
     *         is less than, equal to, or greater than the second.
     */
    @Override
    public int compare(Shape o1, Shape o2) {
       return o1.compareTo(o2);
    }



}
