package leetcode.spiral.matrix;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionSpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> ans = new ArrayList<>();
    ans = sum(matrix,0,0,0, matrix.length -1,0,matrix[matrix.length-1].length-1,1, ans);

        System.out.println(ans);


// 0.0 0.1 0.2 1.2 2.2 2.1
    return ans;

    }
    List<Integer> sum (int[][]matrix, int row, int col, int startRow, int endRow, int startCol, int endCol, int count, List<Integer> sumRow){
        sumRow.add(matrix[row][col]);

        if (count == matrix.length * matrix[matrix.length-1].length) return sumRow;
        if (row == startRow && col < endCol)  {
            return sum (matrix, row, ++col,startRow,endRow,startCol,endCol, ++count,  sumRow);
            } else if (row < endRow && col == endCol ) {
            return sum (matrix, ++row, col,startRow,endRow,startCol,endCol, ++count,  sumRow);
            } else if ( row == endRow && col >startCol ) {
            return sum(matrix, row, --col, startRow, endRow, startCol, endCol, ++count, sumRow);
           } else if (col == startCol && row > startRow+1) {
            return sum(matrix, --row, col, startRow, endRow, startCol, endCol, ++count, sumRow);
        }
        return  sum(matrix, row, ++col, ++startRow, --endRow, ++startCol, --endCol, ++count, sumRow);
    }


}
