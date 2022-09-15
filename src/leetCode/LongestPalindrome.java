package leetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class LongestPalindrome {

    public static void main(String[] args) {
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        System.out.println(longestPalindrome.longestPalindrome("aa"));
    }

    public int longestPalindrome(String s) {
        Set<Character> map= new HashSet<>();
        int longest=0;
        for(int i=0; i<s.length(); i++) {
            if (map.contains(s.charAt(i)))
            {
                longest += 2;
                map.remove(i);
            } else {
                map.add(s.charAt(i));
            }
        }
        if(map.isEmpty()){
            return longest;
        }
        else
            return longest+1;

    }
}
