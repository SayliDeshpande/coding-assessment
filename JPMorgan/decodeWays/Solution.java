package JPMorgan.decodeWays;

public class Solution {
    public static void main(String[] args) {
        String s = "226";
        Solution solution = new Solution();
        System.out.println("Using Dynamic Programming : "+solution.numDecodings(s));
        System.out.println(solution.numDecodings(s));
    }

    private int numDecodings(String s) {
        int n = s.length();
        int dp1 = 1;
        int dp2 = 0;

        for(int i = n - 1 ; i >=0 ; i--){
            int dp = s.charAt(i) == '0' ? 0 : dp1;
            if(i < n - 1 && ( s.charAt(i) == '1' || s.charAt(i) == '2' && s.charAt(i + 1) < '7')){
                dp += dp2;
            }
            dp2 = dp1;
            dp1 = dp;
        }
        return dp1;
    }

    private int numDecodingsUsingDP(String s) {
        if(s.charAt(0) == '0'){
            // there is no decoding possible, so return 0
            return 0;
        }

        int n = s.length();
        // dynamic programming array
        int[] dp = new int[n + 1]; // n + 1, to include empty array possibility
        dp[0] = 1;
        dp[1] = 1; // first char in input string, and we know it is not zero, so can be decoded in 1 way.

        //lets iterate rest of the input string , starting from second char in the string
        for(int i = 1; i < n; i++){
            if(s.charAt(i) != '0'){
                dp[i + 1] += dp[i];
            }
            // check if two dgit decoding is also possible, satisfies below condition
            // starting from one char before current char including current char
            int twoDigit = Integer.parseInt(s.substring(i - 1, i + 1)); // i+1 char is exclusive
            if(twoDigit >= 10 && twoDigit <= 26){
                dp[i + 1] += dp[i - 1];
            }
        }
        return dp[n];

        //time : O(n)
        //space : O(n)
        // we can optimize above by using just two vars instead of dp array; numDecodings()
    }


}
