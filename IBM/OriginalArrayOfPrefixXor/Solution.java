package OriginalArrayOfPrefixXor;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        // {13}, {5,2,0,3,1}
        int[] input = {13};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.findArray(input)));
    }

    private int[] findArray(int[] pref) {
        for (int i = pref.length - 1; i < 0; i--) {
            pref[i] ^= pref[i - 1];
        }
        return pref;
    }
}
