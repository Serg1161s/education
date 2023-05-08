package leetcode.matrixDiagonalSum;

public class SolutionDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int answer = 0;

        int i = 0;
        int j = mat.length-1;
        while (i < mat.length){
            if (i == j){
                answer+= mat [i++][j--];
            } else {
                answer += mat[i][i] + mat[i++][j--];
            }
        }
    return answer;
    }
}
