package kthFactorOfn;
// Find kth factor of n

public class Solution {
    public static void main(String[] args) {
       // 12 & 3 , 7 & 2 , 4 &4
        int n = 4;
        int k = 4;
        Solution solution = new Solution();
        System.out.println(solution.kthFactor(n,k));
    }
    private int kthFactor(int n, int k){
        // to get list of all factors of n sorted in ascending order
        for (int i = 1; i < n; i++) {
            // check, if i is a factor of n, until k = 0
            if(n % i == 0){
                k--;
            }
            if(k == 0){
                return i;
            }
        }
        // Every number is a factor of itself.
        // problem asks us to return -1, if n has less that k factors
        return k == 1 ? n : -1;
    }
}
