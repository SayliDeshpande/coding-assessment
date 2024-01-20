package Google.reverseWordsInString;

public class Solution {

    public static void main(String[] args) {
        String input = "the sky is blue";
        System.out.println(reverseWords(input));
    }
    public static String reverseWords(String s) {
        s = s.trim();
        StringBuilder str=new StringBuilder();
        int endpointer=findEndIndex(s,s.length()-1);
        int srtpointer=findStartIndex(s,endpointer);
        while (srtpointer>0 && endpointer>0){
            str.append(s,srtpointer,endpointer+1);
            endpointer=findEndIndex(s,srtpointer);
            srtpointer=findStartIndex(s,endpointer);
        }
        str.append(" ");
        str.append(s,srtpointer, endpointer+1);
        return str.toString().trim();
    }
    public static int findStartIndex(String s2, int index)
    {
        while (index>0 && s2.charAt(index)!=' ')   {
            index--;
        }
        return index;
    }
    public static int findEndIndex(String s1, int index)
    {
        while (index>0 && s1.charAt(index)==' '){
            index--;
        }
        return index;
    }
}

