package leetcode.algoritm.minimum_time;

public class MainApp {
    public static void main(String[] args) {
        int [] timeTrip = {
                1,2,3,4
        };

        int numOfTrip = 5;

        SolutionMinimumTime solutionMinimumTime = new SolutionMinimumTime();
        System.out.println(solutionMinimumTime.minimumTime(timeTrip,numOfTrip));
    }
}
