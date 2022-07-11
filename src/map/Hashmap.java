package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,10);
        map.put(2,20);
        map.put(3,30);
        map.put(4,40);


        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for(Map.Entry<Integer, Integer> ma: entries){
            System.out.println("Key "+ ma.getKey()+":"+"value "+ ma.getValue());
        }

        /*Alternate Way to do the same*/
        for(Map.Entry entry: map.entrySet()){
            System.out.println("Key "+ entry.getKey()+":"+"value "+ entry.getValue());
        }
    }
}
