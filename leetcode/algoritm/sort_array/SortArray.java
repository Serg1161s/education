package leetcode.algoritm.sort_array;

public class SortArray {
    protected int[] sortArray(int[] nums) {

        int start = 0;
        int end = nums.length-1;

        quickSort(nums,start,end);



        return nums;
    }
        private static void swap (int [] nums, int start1, int start2){

        int temp = nums[start1];
        nums[start1] = nums [start2];
        nums[start2] = temp;


    }
    private static void   quickSort(int [] nums,int start, int end){
       if (nums.length == 0) return;

       if ( end <= start) return;
           int med = start + (end-start)/2;
           int op = nums[med];
        int i = start;
        int j = end;
           while (i <= j) {
               while (nums[i] < op){
                    i++;
               }
               while (nums[j] > op){
                   j--;
               }
               if (i<=j){
                   swap(nums,i,j);
                   i++;
                   j--;

               }
           }
           if (start< j) {
               quickSort(nums,start,j);
           }
           if (end> i) {
               quickSort(nums,i,end);
           }

    }

}
