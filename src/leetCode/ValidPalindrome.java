package leetCode;

import java.util.Locale;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "ab@a";
        ValidPalindrome validPalindrome = new ValidPalindrome();
        String removeSpace= validPalindrome.removeSpace(s);
        boolean result = validPalindrome.isPalindrome(removeSpace);
        System.out.println(result);
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
}
