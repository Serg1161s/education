package leetcode.algoritm.sort_array;

public class MerrgSort {
    protected int[] sortArray(int[] nums) {
        if (nums == null || nums.length == 0) return nums;
        int[] helper = new int[nums.length];
        mergeSort (nums, 0, nums.length -1, helper);
        return nums;
    }
    private void mergeSort (int[] nums, int left, int right, int[] helper) {
        if (left >= right) return;
        int mid = left + (right - left) /2;
        mergeSort (nums, left, mid, helper);
        mergeSort (nums, mid + 1, right, helper);
        merge (nums, left, mid, right, helper);
    }
    private void merge (int[] nums, int left, int mid, int right, int[] helper) {
        for (int i = left; i <= right; i++) {
            helper[i] = nums[i];
        }
        int leftIndex = left;
        int rightIndex = mid +1;
        while (leftIndex <= mid && rightIndex <= right) {
            if (helper[leftIndex] <= helper[rightIndex]) {
                nums[left++] = helper[leftIndex++];
            }
            else nums[left++] = helper[rightIndex++];
        }

        while (leftIndex <= mid) {
            nums[left++] = helper[leftIndex++];
        }
    }
}
