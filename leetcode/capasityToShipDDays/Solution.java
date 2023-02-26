package leetcode.capasityToShipDDays;

import java.util.Arrays;

public class Solution {
    protected int shipWithinDays(int[] weights, int days) {
        int l = Arrays.stream(weights).max().getAsInt();
        int r = 500 * weights.length / days;

        int mid = 0;
        while ( l < r){
            mid = l + (r-l)/2;
            if (feasible(weights,mid,days)){
                r=mid-1;

            } else {
                l=mid+1;

            }
        }


        return l;
    }

    Boolean feasible (int [] weights, int c, int days){
        int needDays = 1;
        int currentLoad = 0;
        for (int weight: weights){
            currentLoad +=weight;
            if (currentLoad > c){
                needDays++;
                currentLoad = weight;
            }
        }
        return needDays <= days;
    }
}
