package maang.productOfArrayExceptSelf;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};//{1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
    public static int[] productExceptSelf(int[] nums) {
        // The length of the input array
        int n = nums.length;
        // Final answer array to be returned
        int[] answer = new int[n];
        // answer[i] contains the product of all the elements to the left
        answer[0] = 1; // for the element at index '0', there are no elements to the left,so the answer[0] would be 1

        //right contains the product of all the elements to the right
        int right = 1;

        for(int i = 1 ; i < n ; i++){
            // answer[i] contains the product of all the elements to the left
            answer[i] = nums[i - 1] * answer[i - 1];
        }

        for(int i = n - 1 ; i >= 0 ; i--){
            answer[i] = answer[i] * right;
            //right contains the product of all the elements to the right
            right *= nums[i];
        }
        return answer;
    }

}
