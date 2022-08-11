package leetCode;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "paper", t="title";
        ValidPalindrome validPalindrome = new ValidPalindrome();
        /*String removeSpace= validPalindrome.removeSpace(s);
        boolean result = validPalindrome.isPalindrome(removeSpace);
        System.out.println(result);*/
        System.out.println(validPalindrome.isIsomorphic(s,t));
    }
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }

        int i=0, j= s.length()-1;
        while (i!=j && j>=i){
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;

    }

    public String removeSpace(String s){
        String concat="";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!=' '){
                concat+=s.charAt(i);
            }
        }
        concat = concat.replaceAll("[-+.^:,@]", "").toLowerCase();
        return concat.toLowerCase();
    }

    public boolean isIsomorphic(String s, String t)
    {  // s =egg    t-> add
        Map<Character, Character> map = new HashMap<>();
        if(s.length()!=t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), t.charAt(i));
            }
        }
        String s1="";
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(0))){
                char value = map.get(s.charAt(i));
                s1=s1+value;
            }
        }
        if(s1.equals(t)) return true;
        else return false;
    }
}
