package leetcode.algoritm.sort_array;

public class SomeTest {

    protected int [] someTest (int [] nums){

        int [] helper = new  int[nums.length];

        quickSort (0,nums.length-1,nums,helper);
        return  nums;
    }

    private  void quickSort (int left, int right, int [] nums, int [] helper){
        if (left >= right) return;;
        int med = left + (right - left)/2;
        quickSort(left,med,nums,helper);
        quickSort(med+1,right,nums,helper);
        marge (left,med,right,nums,helper);

    }
    private  void marge (int left, int med, int right, int [] nums, int [] helper){
        for (int i = left; i <= right; i++) {
            helper[i] = nums[i];
        }

        int leftIndex = left;
        int rightIndex = med+1;
        while (leftIndex<=med && rightIndex<=right){
            if (helper[leftIndex] <= helper[rightIndex]){
                nums[left++] = helper[leftIndex++];
            } else {
                nums[left++] = helper[rightIndex++];
            }
        }
        while (leftIndex<= med){
            nums[left++] = helper[leftIndex++];
        }


    }
}
