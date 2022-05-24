package comparator;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args){
        TreeMap<String, Double> treeMap = new TreeMap<>(new TComp());
        treeMap.put("Test File",34.44);
        treeMap.put("Test Save", 34.4);
        treeMap.put("Test Open", 34.43);

        for (Map.Entry map: treeMap.entrySet()
             ) {
            System.out.println("Value"+ map.getValue()+"Key"+map.getKey());
        }

    }
}

