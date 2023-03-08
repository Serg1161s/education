package leetcode.algoritm.minimum_time;

public class MainApp {
    public static void main(String[] args) {
        int [] timeTrip = {
               3,4,5,6,7

        };

        int numOfTrip = 20;

        SolutionMinimumTime solutionMinimumTime = new SolutionMinimumTime();
        System.out.println(solutionMinimumTime.minimumTime(timeTrip,numOfTrip));
    }
}
