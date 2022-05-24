package comparator;

import java.util.Comparator;

public class TComp implements Comparator<String> {

    /**
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(String o1, String o2) {

        int i, j, k;

        i= o1.lastIndexOf(' ');
        j= o2.lastIndexOf(' ');
        k=o1.substring(i).compareTo(o2.substring(j));
        if(k==0){
            return o1.compareToIgnoreCase(o2);
        }else
            return k;
    }
}
