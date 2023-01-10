package leetcode.find.ball;

import java.util.Arrays;

public class SolutionFindBall {

    protected  int[] findBall(int[][] grid) {

        for (int i = 0; i < grid.length; i++) {
            System.out.println(Arrays.toString(grid[i]));

        }

        int [] ans = new int[grid[grid.length-1].length];

        for (int i = 0; i < grid[grid.length-1].length; i++) {

                ans[i] = way(grid,i);


        } //  System.out.println(Arrays.toString(ans));
        return ans;
    }
    private static int way (int [][] grid, int col){
        int currentRow = 0;
        int currentCol = col;
        while (currentRow < grid.length ){
            if ( grid[currentRow][currentCol] == -1 && currentCol==0 || grid[currentRow][currentCol] == 1 && currentCol == grid[grid.length-1].length-1) {
                return -1;
            } else if (grid[currentRow][currentCol] ==1 && grid[currentRow][currentCol+1] ==-1 ) {
                return -1;
            } else if (grid[currentRow][currentCol] == -1 && grid[currentRow][currentCol-1] == 1 ) {
               return -1;
            }else if (grid[currentRow][currentCol] ==1 && grid[currentRow][currentCol+1] ==1 ) {
                currentCol++;
                currentRow++;
            } else if (grid[currentRow][currentCol] ==-1 && grid[currentRow][currentCol-1] == -1 ) {
                currentCol--;
                currentRow++;
            }


        }
        return  currentCol;
    }
}
