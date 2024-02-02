package maang.singleNumber2;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println("Single value in the given array is :- "+ singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        int ones = 0, twos = 0;
        for(int i = 0; i < nums.length; i++){
            ones = (ones ^ nums[i]) & ~twos;
            twos = (twos ^ nums[i]) & ~ones;
        }
        // Return integer which appears exactly once
        return ones;

    }
}
