package leetcode.matrixDiagonalSum;

public class MainAppDiagonalSum {
    public static void main(String[] args) {

        int [][] matrix = { {1,2,3,2},
                            {4,5,6,2},
                            {7, 8, 9,2},
                            {1,1,1,1}};

        SolutionDiagonalSum solutionDiagonalSum = new SolutionDiagonalSum();
        System.out.println(solutionDiagonalSum.diagonalSum(matrix));


    }
}
