package leetcode.algoritm.sort_array;

public class SortArray {
    public int[] sortArray(int[] nums) {

        int start1 = 0;
        int start2 = 1;
        int step = 1;
        while (start2 < nums.length) {
            while (start1 != nums.length - 1 && start2 < nums.length) {
                int end = start2;
                while (start1 < end) {
                    if (nums[start1] > nums[start2]) {
                        nums = swap(nums, start1, start2);
                    }
                    start1++;
                    start2++;
                }
                start1 = start1 + step;
                start2 = start2 + step;


            }
            step = step * 2;
            start1 = 0;
            start2 = start1 + step;
        }




        return nums;
    }
        private static int [] swap (int [] nums, int start1, int start2){

        int temp = nums[start1];
        nums[start1] = nums [start2];
        nums[start2] = temp;
        return nums;

    }

}
