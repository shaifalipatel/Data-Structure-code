package map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Double> treeMap = new TreeMap<>();
        treeMap.put("Hello", 12.34);
        treeMap.put("Hi", 12.3);
        treeMap.put("Hi", 12.4);

        for (Map.Entry map: treeMap.entrySet()) {
            System.out.println(map+"key"+ map.getKey()+"Value"+map.getValue());
        }

    }
}
