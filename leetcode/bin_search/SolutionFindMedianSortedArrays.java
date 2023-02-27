package leetcode.bin_search;

public class SolutionFindMedianSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans = 0;

        int [] max;
        int [] min;
        if (nums1[(nums1.length-1)/2] > nums2[(nums2.length-1)/2] ){
             max = nums1;
             min = nums2;
        } else {
            max = nums2;
            min = nums1;
        }

        int startMax = 0;
        int endMax = (max.length-1)/2;
        int startMin = 0;
        int endMin = min.length-1;
        int median = endMax;
        int currentLeft = 0;
        int currentRight =1;
        int totalLength = min.length + max.length;

        while (totalLength - currentLeft != currentLeft){

                int leftMin = foundMidLeft (min,startMin,endMin,max[median]);
                int leftMax = median;
                currentLeft = leftMax + leftMin;

            if (totalLength - currentLeft -currentLeft == 1 || totalLength - currentLeft == currentLeft ){
                return median;
            }
            if (totalLength - currentLeft < currentLeft) {
                endMax = median-1;
                median = startMax + (endMax - startMax)/2;
            } else if (totalLength - currentLeft > currentLeft) {
                startMax = median + 1;
                median = startMax + (endMax - startMax) / 2;
            }
        }
        return max[median];

    }
    private static int foundMidLeft(int [] nums, int left,int right,int num){
        int position = 0;
        while ( left <  right ){
            position = left + (right-left)/2;
            if (nums[position] == num){
                return position;
            } else if (nums[position] > num) {
                right = position-1;
            } else if (nums[position] < num){
                left=position+1;
            }
        }

        return left;
    }
}
///// 1 2 3 / 4
/////   3 / 4 5 6
/////   2 2 2 //  2 2 // 2 2 2
/////                           //1 1 // 1 1 1