package leetcode.arrays.marge_sorted_arrays;

import java.util.Arrays;

public class SolutionSortedArrays
{
    public void marge (int[] nums1, int m, int [] nums2, int n) {

        for (int i = n+m-1; i>= 0; i-- ) {
            if (n == 0) break;
            if (m <= 0) {

                while (i>=0){
                    nums1[i--] = nums2[n-1];
                    n--;
                }
            } else {
                if (checkNumbers(nums1[m - 1], nums2[n - 1])) {
                    nums1[i] = nums1[m - 1];
                    nums1[m - 1] = 0;
                    m--;
                } else {
                    nums1[i] = nums2[n - 1];
                    n--;
                }
            }


        }
    }

    private  boolean  checkNumbers (int num1, int num2){
        return num1>=num2;
    }
}
/*
1 2 3 0 0 0
2 3 4
 */
