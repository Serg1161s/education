package leetcode.spiral.matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainAppSpiralMatrix {
    public static void main(String[] args) {
        int [][] matrix = new int[3][4];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random()*10);

            }

        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));

        }

        SolutionSpiralMatrix sol = new SolutionSpiralMatrix();

       sol.spiralOrder(matrix);

    }
}
