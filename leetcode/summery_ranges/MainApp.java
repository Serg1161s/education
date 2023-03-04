package leetcode.summery_ranges;

import java.util.Arrays;

public class MainApp {

    public static void main(String[] args) {

        int [] nums = {0,1,4,7};

        SolutionSummeryRanges solutionSummeryRanges = new SolutionSummeryRanges();
        System.out.println(Arrays.asList(solutionSummeryRanges.summaryRanges(nums)));
    }

}
