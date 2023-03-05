package leetcode.bin_search;

public class SolutionFindMedianSortedArrays {
        private  int [] max;
        private  int [] min;
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {

      int startNum1 = 0;
      int startNum2 = 0;
      int endNum1 = nums1.length-1;
      int endNum2 = nums2.length-1;

          int medNum1 = foundMed(startNum1,endNum1);
          int medNum2 = foundMed(startNum2,endNum2);


        int coler = 0;
          while (startNum1<=medNum1 && startNum2 <= medNum2 && medNum1<=endNum1 && medNum2<=endNum2 ){
              if (nums1[medNum1] >= nums2[medNum2]) {
                 coler = Math.min(endNum1-medNum1,medNum2 -startNum2 );
                 endNum1 = endNum1-coler-1;
                 startNum2 = startNum2+coler+1;
              } else {
                  coler = Math.min(endNum2-medNum2,medNum1 -startNum1 );
                  endNum2 = endNum2-coler-1;
                  startNum1 = startNum1+coler+1;
              }
              medNum1 = foundMed(startNum1,endNum1);
              medNum2 = foundMed(startNum2, endNum2);

          }
      System.out.println("startNum1 = " + startNum1 + ", endNum1 =" + endNum1);
      System.out.println("startNum2 = " + startNum2 + ",  endNum2 = " + endNum2);

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