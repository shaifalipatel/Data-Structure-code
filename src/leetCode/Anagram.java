package leetCode;

import java.util.Arrays;
import java.util.HashMap;

public class Anagram {

    public static void main(String[] args) {
        Anagram a= new Anagram();
        System.out.println(a.isAnagram("anagram", "nagaram"));

    }

    public boolean isAnagram(String s, String t) {

        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);

        return Arrays.equals(s1, s2);
    }


}
