package maang.RomantoInteger;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    static Map<String, Integer> map = new HashMap<>();
    static{
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

    }
    public int romanToInt(String s) {
        int n = s.length();
        String lastSymbol = s.substring(s.length() - 1);
        int lastValue = map.get(lastSymbol);
        int totalSum = lastValue;

        for(int i = n - 2 ; i >= 0 ; i--){
            String currSymbol = s.substring(i, i + 1);
            int currVal = map.get(currSymbol);

            if(currVal < lastValue){
                totalSum -= currVal;
            }else{
                totalSum += currVal;
            }
            lastValue = currVal;
        }
        return totalSum;
    }


    public static void main(String[] args) {
        romanToInteger.Solution solution = new romanToInteger.Solution();
        // LVIII DXCI
        String input = "MCMXCIV";
        System.out.println(solution.romanToInt(input));

    }
}
