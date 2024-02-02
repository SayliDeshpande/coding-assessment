package maang.ContainsDuplicate;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));
    }

    public static  boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = nums.length - 1; i >= 0 ; i--) {
            if(!set.add(nums[i])) return true;
        }
        return false;
    }
}
