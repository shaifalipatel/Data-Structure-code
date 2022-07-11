package leetCode;

public class Implement_strStr {

    public static void main(String[] args) {
        String s ="  Bob    Loves  Alice   ";
        String b="a";
        Implement_strStr implementStrStr = new Implement_strStr();
    /*    System.out.println(implementStrStr.strStr(s,b));
    a good   example
        System.out.println(implementStrStr.myAtoi(s));*/
        System.out.println(implementStrStr.reverseWords(s));

    }

/*    Example 1:

    Input: haystack = "hello", needle = "ll"
    Output: 2
    Example 2:

    Input: haystack = "aaaaa", needle = "bba"
    Output: -1*/
    public int strStr(String haystack, String needle) {
        int hayStackLength = haystack.length();
        for(int i=0; i<haystack.length(); i++){
            if(hayStackLength-- < needle.length())
                return -1;
            if(haystack.charAt(i)==needle.charAt(0)){
                String substring = haystack.substring(i,i+needle.length());
                if(substring.equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }

    public int myAtoi(String s) {
        String removeAll = s.replaceAll("[^\\d+-]", "");
        System.out.println(removeAll);
        int result= Integer.parseInt(removeAll);
        return result;
    }

    public String reverseWords(String s) {
        String newString ="";
        s= s.trim();
        int i, j=0;
        for(i=0; i<s.length(); i++){
            if (s.charAt(i) == ' ') {
               if(newString.isEmpty())
                        newString=s.substring(j,i)+newString;
               else{
                   if(++j==i){
                       j=i;
                       continue;
                   }
                   newString =s.substring(j, i)+' '+ newString;
               }
                j = i;
            }
        }
        return (s.substring(j)+' '+newString).trim();
    }
}
