package leetcode.find.ball;

public class MainAppFindBall {
    public static void main(String[] args) {


        int [][] grid = { { 1, 1, 1,-1,-1},
                          { 1, 1, 1,-1,-1},
                          {-1,-1,-1, 1, 1},
                          { 1, 1, 1, 1,-1},
                          {-1,-1,-1,-1,-1}
                         };
        SolutionFindBall solutionFindBall = new SolutionFindBall();
        solutionFindBall.findBall(grid);
    }
}
