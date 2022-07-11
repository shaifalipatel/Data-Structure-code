package leetCode;

import java.util.ArrayList;
import java.util.List;

public class anything {
    public static void main(String[] args) {
        Double d1 = 10.0/0.0;
        System.out.println(d1.isInfinite());
       /* List<? super A> list = new ArrayList<>();
        List<? extends A> list2 = new ArrayList<>();
        list = list2;
        list2 = list;
        list.add(new A());
        list2.add(new b());
        list.add(list2.get(0));
        list2.add(list.get(0));*/
    }
}

  class A{};
class b extends A{

}

