package leetcode.arrays.marge_sorted_arrays.pages.functions;

public class MargeToArrays {
    public static void margeToArrays ( int [] nums1, int [] nums2, int n){
        int i = n;
        int j = 0;

        for (int k = 0; k < nums1.length; k++) {
            if (j == n) {
                break;
            }
            if (i == nums1.length) {
                while (j < nums2.length) {
                    nums1[k++] = nums2[j++];
                }
            } else {
                if (nums1[i] < nums2[j]) {
                    nums1[k] = nums1[i++];
                } else {
                    nums1[k] = nums2[j++];
                }
            }

        }
    }
}
