package leetcode.algoritm.minimum_time;

import java.util.Arrays;
import java.util.Hashtable;

public class SolutionMinimumTime {
    protected long minimumTime(int[] time, int totalTrips) {
        int n = time.length;
        double tripsPerUnitTime = 0.0;
        int minimumTime = Integer.MAX_VALUE;
        for(int i=0;i<n;i++) {
            tripsPerUnitTime += (double)1/time[i];
            if(minimumTime>time[i]) {
                minimumTime = time[i];
            }
        }

        long timeForTrips = (int)Math.ceil((double)totalTrips/tripsPerUnitTime);
        // find the number of trips in timeForTrips and find remaining time for partial trips
        long minTime = timeForTrips;
        long maxTime = Integer.MAX_VALUE;
        long trips = 0;
        for(int i=0;i<n;i++) {
             trips += timeForTrips/time[i];
        }
        if(trips>=totalTrips) {
            return timeForTrips;
        }

        minTime = timeForTrips;
        maxTime = timeForTrips+(totalTrips-trips)*minimumTime;
        do {
            timeForTrips = (minTime+maxTime)/2;
            trips=0;
            minimumTime = Integer.MAX_VALUE;
            for(int i=0;i<n;i++) {
                trips += timeForTrips/time[i];
            }
            if(trips < totalTrips) {
                minTime = timeForTrips;
            } else {
                maxTime = timeForTrips;
            }
        } while(maxTime - minTime>1);

        return maxTime;
    }
}