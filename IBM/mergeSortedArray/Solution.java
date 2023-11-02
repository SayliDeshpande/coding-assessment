package mergeSortedArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        Solution solution = new Solution();
        solution.merge(nums1, m,nums2,n);
        System.out.println(Arrays.toString(nums1));

    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // using 3 pointers, two reader and one writer
        int reader1 = m - 1;
        int reader2 = n - 1;
        for (int writer = m + n - 1; writer >=0 ; writer--) {
            if(reader1 >=0 && reader2 >= 0 ){
                nums1[writer] = nums1[reader1] > nums2[reader2] ? nums1[reader1--] : nums2[reader2--];
            } else if (reader1 >=0 ) {
                nums1[writer] = nums1[reader1--];
            } else if (reader2 >= 0) {
                nums1[writer] = nums2[reader2--];
            }

        }

    }
}
