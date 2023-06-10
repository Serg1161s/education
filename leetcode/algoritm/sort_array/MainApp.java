package leetcode.algoritm.sort_array;

import java.util.Arrays;

public class MainApp {

    public static void main(String[] args) {

        int [] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random()*10);
        }


        System.out.println(Arrays.toString(nums));
        SortArray sortArray = new SortArray();
        MerrgSort merrgSort = new MerrgSort();
        BestSort bestSort = new BestSort();
        SomeTest someTest = new SomeTest();
   //     System.out.println( Arrays.toString(merrgSort.sortArray(nums)));
        System.out.println(Arrays.toString(someTest.someTest(nums)));
       // System.out.println(Arrays.toString(sortArray.sortArray(nums)));
//           System.out.println(Arrays.toString(bestSort.sortArray(nums)));
    }
}
