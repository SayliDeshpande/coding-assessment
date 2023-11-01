package romanToInteger;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    static Map<String, Integer> map = new HashMap<>();
    static {
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
    }

    public int romanToInt(String s){
        int n = s.length();
        String lastSymbol = s.substring(n -1);
        int lastValue = map.get(lastSymbol);
        int answer = lastValue;

        for (int i = n - 2; i >= 0 ; i--) {
            String currSymbol = s.substring(i, i + 1);
            int currValue = map.get(currSymbol);
            if(currValue < lastValue){
                answer -= currValue;
            }else{
                answer += currValue;
            }
            lastValue = currValue;
        }
        return answer;

    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        // LVIII DXCI
        String input = "MCMXCIV";
        System.out.println(solution.romanToInt(input));

    }
}
