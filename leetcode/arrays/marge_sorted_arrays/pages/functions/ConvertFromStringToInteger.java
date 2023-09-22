package leetcode.arrays.marge_sorted_arrays.pages.functions;

public class ConvertFromStringToInteger {
    public static int[] converToInteger(String nums1s, int n) {

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
    private static boolean checkNum(char c) {
        return Character.isDigit(c);

    }
}
