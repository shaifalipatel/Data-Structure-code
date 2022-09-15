package leetCode;

import java.util.HashMap;

public class Isomorphic {
    public static void main(String[] args) {
        Isomorphic isomorphic = new Isomorphic();
        System.out.println(isomorphic.isIsomorphic("badc","baba"));
    }

    public boolean isIsomorphic(String s, String t) { //egg--> add
        HashMap<Character, Character> map= new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                if(!map.containsValue(t.charAt(i)))
                    map.put(s.charAt(i), t.charAt(i));
            }
        }
        String result="";
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i)))
                result+=map.get(s.charAt(i));
        }
        return result.equals(t);

    }
}
