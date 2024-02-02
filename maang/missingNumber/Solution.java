package maang.missingNumber;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 ={0,1};
        int[] nums2 ={9,6,4,2,3,5,7,0,1};
        System.out.println("Missing number is nums1 :- " + missingNumberbyBitmanipulation(nums1));
        System.out.println("Missing number is nums2 :- "+ missingNumberbyMaths(nums2));
    }

    public static int missingNumberbyBitmanipulation(int[] nums) {
        int missing = nums.length;
        for (int i = 0; i < nums.length; i++) {
            missing ^= i ^ nums[i];
        }
        return missing;
    }

    public static int missingNumberbyMaths(int[] nums){
        int sum = 0;
        sum=((nums.length*(nums.length+1)/2));
        //int i  = 0;
        for(int i =0; i<nums.length;i++){
            sum= sum-nums[i];
        }
        return sum;
    }
}