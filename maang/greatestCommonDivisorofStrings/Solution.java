package maang.greatestCommonDivisorofStrings;

public class Solution {
    public static void main(String[] args) {
       // String str1 = "ABCABC", str2 = "ABC";
         String str1 = "ABABAB", str2 = "ABAB";
       // String str1 = "LEET", str2 = "CODE";
        System.out.println(gcdOfStrings(str1, str2));
    }

    public static String gcdOfStrings(String str1, String str2){
        if(str1.length() < str2.length()){
            return gcdOfStrings(str2, str1);
        }
        if(str1.equals(str2)){
            return str1;
        }
        if(str1.startsWith(str2)){
            return gcdOfStrings(str1.substring(str2.length()), str2);
        }
        return "";
    }
}
