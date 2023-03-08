package leetcode.algoritm.minimum_time;

import java.util.Arrays;
import java.util.Hashtable;

public class SolutionMinimumTime {
    protected long minimumTime(int[] time, int totalTrips) {
        int ans = 0;
        int [] count = new int[time.length];

         Arrays.sort(time);
        int currTime = time[0];
       while ( totalTrips != 0 ) {
           int i = 0;
           while (i < time.length && totalTrips != 0){
           if ( currTime == time[i] * (count[i]+ 1)) {
               count[i]++;
               totalTrips--;
               i++;

           } else {
               if (i < time.length - 1 && time[i+1] > currTime ) {
                   break;
               }
           i++;
           }
           }
           currTime++;
       }
        for (int i = 1; i < time.length; i++) {


            ans = Math.max(time[i] * (count[i]+1), time[i-1] * (count[i-1] +1) );
        }



        return currTime -1;
    }
}
// 2 5  10    20

