package maang.singleNumber;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println("Single value in the given array is :- "+ singleNumber(nums));
    }
    public static int singleNumber(int[] nums){
        int val = 0;
        //So we can XOR all bits together to find the unique number.
        // xor of same bits is 0
        // xor of 0 and bit = bit
        for (int n : nums){
            val ^= n; // same bits xor is zero
        }
        return val;
    }
}

/*
Approach 4: Bit Manipulation
Concept

If we take XOR of zero and some bit, it will return that bit
a⊕0=a
If we take XOR of two same bits, it will return 0
a⊕a=0
a⊕b⊕a=(a⊕a)⊕b=0⊕b=b
So we can XOR all bits together to find the unique number.

Complexity Analysis

Time complexity : O(n). We only iterate through nums\text{nums}nums, so the time complexity is the number of elements in nums\text{nums}nums.

Space complexity : O(1).

 */