package leetcode.algoritm.bananas;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};



        SolutionEating solutionEating = new SolutionEating();

        System.out.println(Arrays.toString(nums));
        System.out.println(solutionEating.minEatingSpeed(nums,6));

    }


}
