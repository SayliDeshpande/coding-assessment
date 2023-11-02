package LongestCommonPrefix;

public class Solution {
    public static void main(String[] args) {
        String[] input = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(input));
    }

    private static String longestCommonPrefix(String[] strs) {
        String pre = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(pre) != 0){
                pre = pre.substring(0, pre.length() - 1);
            }
        }
        return pre;
    }
}
/*
Complexity Analysis

Time complexity : O(S) , where S is the sum of all characters in all strings.

In the worst case all n strings are the same.
The algorithm compares the string S1S1S1 with the other strings [S2…Sn]
 There are S character comparisons, where S is the sum of all characters in the input array.

Space complexity : O(1). We only used constant extra space.

 */