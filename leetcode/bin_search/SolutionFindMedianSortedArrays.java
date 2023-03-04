package leetcode.bin_search;

public class SolutionFindMedianSortedArrays {

//    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//
//        int lengthNum1 = nums1.length - 1;
//        int lengthNum2 = nums2.length - 1;
//
//
//
//        int startNum1 = 0;
//        int startNum2 = 0;
//        int endNum1 = nums1.length-1;
//        int endNum2 = nums2.length -1;
//        int n1;
//        int n2;
//
//        while (checkSituatuin (nums1,nums2,n1,n2)) {
//            n1 = startNum1 + (endNum1 - startNum1)/2;
//            n2 = startNum2 + (endNum2 -startNum2)/2;
//            if (nums1[n1] == nums2[n2]) {
//                startNum1 = n1;
//                startNum2 = n2;
//                endNum1 = n1;
//                endNum2 = n2;
//            }
//        }
//
//
//    }
//    private boolean checkSituatuin (int [] nums1, int [] nums2,int n1,int n2){
//        if (nums1[n1] < nums2[n2+1])
//
//    }
//
}

///// 1 2 3 / 4
/////       {1,2,3,4 ,5,   7 7,7,  7,7,8,9};
//         {2,3,4,6,    6,       8,9,9,9};