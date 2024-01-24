package maang.mergeStringsAlternately;

public class Solution {
    public static void main(String[] args) {
        String word1 = "sayali";
        String word2 = "ameya";
        System.out.println(mergerAlternately(word1, word2));
    }

    public static String mergerAlternately(String word1, String word2){
        // to store the result
        StringBuilder sb = new StringBuilder();

        // get minLength, so that we can append remaining chars from the word having chars more than min length
        int minLength = Math.min(word1.length(), word2.length());

        for (int i = 0; i < minLength; i++) {
            // start appending chars alternatively
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        // remember to append remaining chars if any

         return sb.append(word1.substring(minLength)).append(word2.substring(minLength)).toString();
    }
}
