package appDomain;

import java.util.Comparator;

/**
 * Comparator implementation that compares two Shape objects based on their height.
 */
public class HeightComparator implements Comparator<Shape> {
	
    /**
     * Compares its two arguments for order based on height.
     * 
     * @param o1 the first shape to be compared.
     * @param o2 the second shape to be compared.
     * @return a negative integer, zero, or a positive integer as the first argument 
     *         is less than, equal to, or greater than the second.
     */
    @Override
    public int compare(Shape o1, Shape o2) {
        return Double.compare(o1.getHeight(), o2.getHeight());
    }
}
