package leetcode.algoritm.sort_array;

public class BestSort {
    public int[] sortArray(int[] nums) {
        int min = nums[0], max = nums[0];
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < min) min = nums[i];
            if(nums[i] > max) max = nums[i];
        }

        int[] arr = new int[max-min+1];
        for(int i = 0; i < nums.length; i++) {
            int idx = nums[i] - min;
            arr[idx]++;
        }
        int k = 0;
        for(int i = 0; i < arr.length; i++) {
            while(arr[i] > 0) {
                nums[k++] = min;
                arr[i]--;
            }
            min++;
        }
        return nums;
    }

}
