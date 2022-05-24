package comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class ReverseString implements Comparator<String> {
    /**
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }

    public static void main(String[] args){
        TreeSet<String> treeSet = new TreeSet<>(new ReverseString());
        treeSet.add("A");
        treeSet.add("C");
        treeSet.add("G");
        treeSet.add("B");

        for (String s:treeSet
             ) {
            System.out.println(s+" ");
        }

        //using lambda expression

    }
}
