package leetcode.algoritm.minimum_time;

public class MainApp {
    public static void main(String[] args) {
        int [] timeTrip = {
              10,20,30,40,50

        };

        int numOfTrip = 10;

        SolutionMinimumTime solutionMinimumTime = new SolutionMinimumTime();
        System.out.println(solutionMinimumTime.minimumTime(timeTrip,numOfTrip));
    }
}
