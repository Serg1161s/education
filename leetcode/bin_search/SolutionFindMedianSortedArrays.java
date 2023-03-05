package leetcode.bin_search;

public class SolutionFindMedianSortedArrays {

  public double findMedianSortedArrays(int[] nums1, int[] nums2) {

      int startNum1 = 0;
      int startNum2 = 0;
      int endNum1 = nums1.length-1;
      int endNum2 = nums2.length-1;

          int medNum1 = foundMed(startNum1,endNum1);
          int medNum2 = foundMed(startNum2,endNum2);


          while (!checkSituation(nums1,nums2,medNum1,medNum2)){
              if (nums1[medNum1] > nums2[medNum2]) {
                  endNum1 = Math.min(startNum2,medNum1);
              }

          }


        return  3;


  }
  private boolean checkSituation (int [] nums1, int [] nums2,int n1,int n2){
      if (nums1[n1] > nums2[n2+1] || nums1[n1] < nums2[n2+1]) return  false;
      if (nums2[n2] > nums1[n1+1] || nums2[n2] < nums1[n1-1]) return false;

      return true;

  }
  private static int foundMed (int start, int end){
      int med = start + (end - start) / 2;

      return med;

  }
//
}

///// 1 2 3 / 4
/////       {1,2,3, 7, 7,8,9};
//            {2,3, 4,  6, 6};