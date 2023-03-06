package leetcode.summery_ranges;

import java.util.ArrayList;
import java.util.List;

public class SolutionSummeryRanges {
    public List<String> summaryRanges(int[] nums) {

        List<String> list = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        if (nums.length < 1) return list;
        if (nums.length == 1){
            temp.append(nums[0]);
            list.add(temp.toString());return list;
        }

        for (int i = 0; i < nums.length; i++) {
            int start = i;
            int count =0;
            if (i< nums.length-1) {
                while (checkNum(i,nums)) {
                    i++;
                    count++;
                }
            }
            if (count>0) {
               temp.append(nums[start]).append("->").append(nums[i]);
            } else
                temp.append(nums[start]);

            list.add(temp.toString());
            temp.setLength(0);
        }
        return list;
    }
    private static boolean checkNum(int i, int [] nums){
        if ( i >= nums.length-1) return false;
        return nums[i+1] - nums[i] == 1;
    }

}
