package maang.DivideArrayIntoArraysWithMaxDifference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        if (n % 3 != 0){
            return new int[0][0];
        }
        Arrays.sort(nums);
        int[][] ans = new int[n / 3][3];
        for(int i = 0 ; i < n ; i += 3){
            if(nums[i + 2] - nums[i] > k){
                return new int[0][0];
            }else{
                ans[i / 3] = new int[]{nums[i], nums[i + 1], nums[i + 2]};
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,4,8,7,9,3,5,1};
        int k = 2;
        System.out.println(Arrays.deepToString(divideArray(nums,k)));
        // use deepToString to print 2d array else use Arrays.toString() to print 1D array
    }
}
