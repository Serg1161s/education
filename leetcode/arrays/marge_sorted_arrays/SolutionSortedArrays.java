package leetcode.arrays.marge_sorted_arrays;

import java.util.Arrays;

public class SolutionSortedArrays
{
    String ans;


    public String marge (String nums1s, String nums2s, int n) {

        int [] nums1 = converToInteger(nums1s,n+n);
        int [] nums2 = new int [n];
        int m = n;



        for (int i = n+n-1; i>= 0; i-- ) {
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
        System.out.println(Arrays.toString(nums1));
        ans = String.valueOf(nums1);
        System.out.println(ans);
        return Arrays.toString(nums1);
    }

    private int[] converToInteger(String nums1s, int n) {

        int [] ans = new int[n];
        int countAns = 0;
        for (int i = 0; i < nums1s.length(); i++) {
            int count = 0;
            while (checkNum(nums1s.charAt(i + count))) {
                count++;
                if ( i+count == nums1s.length()) break;
            }
            if (count > 0) {
                ans[countAns++] = Integer.valueOf(nums1s.substring(i, i + count));
            }
            i += count;

        }

        return ans;
    }

    private boolean checkNum(char c) {
        return Character.isDigit(c);

    }

    private  boolean  checkNumbers (int num1, int num2){
        return num1>=num2;
    }
}
/*
1 2 3 0 0 0
2 3 4
 */
