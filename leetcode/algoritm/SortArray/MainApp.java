package leetcode.algoritm.SortArray;

import java.util.Arrays;

public class MainApp {

    public static void main(String[] args) {

        int [] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random()*10);
        }


        System.out.println(Arrays.toString(nums));
        SortArray sortArray = new SortArray();

        System.out.println(Arrays.toString(sortArray.sortArray(nums)));
    }
}
