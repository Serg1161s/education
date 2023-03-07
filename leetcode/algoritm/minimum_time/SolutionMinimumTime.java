package leetcode.algoritm.minimum_time;

import java.util.Arrays;

public class SolutionMinimumTime {
    protected long minimumTime(int[] time, int totalTrips) {
        int ans = 0;

         Arrays.sort(time);

        while (totalTrips != 0) {
            int curTime = 1;

            for (int i = 0; i < time.length; i++) {
              if (time[i] <= curTime ){
                  totalTrips--;
              }
              if (time [i] > curTime )



            }



        }


        System.out.println(Arrays.toString(time));

        return ans;
    }
}
