package leetcode.algoritm.bananas;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        int [] nums = {
                1,2,3,4,5,6,7,8,9,10
        };



        SolutionEating solutionEating = new SolutionEating();

        System.out.println(Arrays.toString(nums));
        System.out.println(solutionEating.minEatingSpeed(nums,15
        ));

    }


}
// 27/ (8 - 4 +1) +1 27/5 + 1 = 6