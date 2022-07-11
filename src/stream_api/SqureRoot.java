package stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SqureRoot {

    public static void main(String[] args){
        ArrayList<Double> arrayList = new ArrayList<>();
        arrayList.add(17.23);
        arrayList.add(17.43);
        arrayList.add(17.2);
        arrayList.add(17.3);

        arrayList.stream().forEach(i-> System.out.println("Initial value "+i));

        List<Double> list= arrayList.stream().map(i-> Math.sqrt(i)).collect(Collectors.toList());
        list.forEach(i-> System.out.println("Square root value "+i));

        arrayList.stream().filter(i->i%2!=0).forEach(j-> System.out.println("Even value "+j));
    }
}
