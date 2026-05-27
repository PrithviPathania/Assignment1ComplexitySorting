package appDomain;

import java.util.Comparator;

public class DefaultComparator implements Comparator<Shape> {

    @Override
    public int compare(Shape o1, Shape o2) {
       return o1.compareTo(o2);
    }



}
