package intergerToRoman;

public class Solution {
    private static final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] symbols = {"M", "CM", "D", "CD","C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public String intToRoman(int num){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < values.length && num > 0; i++) {
            while (values[i] <= num){
                num -= values[i];
                result.append(symbols[i]);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        // 3 58 1994
        int input = 58;
        Solution solution = new Solution();
        System.out.println(solution.intToRoman(input));

    }
}
