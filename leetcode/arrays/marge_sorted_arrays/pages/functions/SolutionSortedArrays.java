package leetcode.arrays.marge_sorted_arrays.pages.functions;

import leetcode.arrays.marge_sorted_arrays.pages.functions.ConvertFromStringToInteger;
import leetcode.arrays.marge_sorted_arrays.pages.functions.MargeToArrays;

import java.util.Arrays;

public class SolutionSortedArrays
{
    public String marge (String nums1s, String nums2s, int n) {

        int[] nums1 = ConvertFromStringToInteger.converToInteger(nums1s, n + n);
        int[] nums2 = ConvertFromStringToInteger.converToInteger(nums2s, n);

        Arrays.sort(nums2);
        Arrays.sort(nums1);

        MargeToArrays.margeToArrays(nums1, nums2, n);

        return Arrays.toString(nums1);
    }
}
/*
1 2 3 0 0 0
2 3 4
 */
