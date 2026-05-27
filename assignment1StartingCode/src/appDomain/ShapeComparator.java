package appDomain;
import java.util.Comparator;

public class ShapeComparator implements Comparator<Shape> {

    @Override
    public int compare(Shape o1, Shape o2) {
        char compType = 'h';
        switch (compType) {
            case 'h':
                if (o1.getHeight() < o2.getHeight()) {
                    return -1;
                }
                else if (o1.getHeight() == o2.getHeight()) {
                    return 0;
                }
                else if (o1.getHeight() > o2.getHeight()) {
                    return 1;
                }
                break;
            case 'v':
                if (o1.calcVolume() < o2.calcVolume()) {
                    return -1;
                }
                else if (o1.calcVolume() == o2.calcVolume()) {
                    return 0;
                }
                else if (o1.calcVolume() > o2.calcVolume()) {
                    return 1;
                }
                break;
            case 'a':
                if (o1.calcBaseArea() < o2.calcBaseArea()) {
                    return -1;
                }
                else if (o1.calcBaseArea() == o2.calcBaseArea()) {
                    return 0;
                }
                else if (o1.calcBaseArea() > o2.calcBaseArea()) {
                    return 1;
                }
                break;

            
        }
        return 0;
    }

}
