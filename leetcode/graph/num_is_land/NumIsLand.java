package leetcode.graph.num_is_land;

import java.util.HashSet;
import java.util.Set;

public class NumIsLand {

        int r;
        int c;
        char[][] arr;
        int count;
        public int numIslands(char[][] grid) {
            r = grid.length;
            c = grid[0].length;
            arr = grid;

            count =0;
            for(int i=0;i<r;i++){
                check(grid[i],i);
                // for(int j= 0;j<c;j++){
                //     if(grid[i][j] == '1'){
                //         count++;
                //         visitIsland(i, j);
                //     }
                // }
            }

            return count;
        }

        void check(char[] row,int i)
        {
            for(int j=0;j<c;j++)
            {
                if(row[j]=='1')
                {
                    visitIsland(i,j);
                    count++;
                }
            }
        }


        public void visitIsland(int i, int j){
            arr[i][j] = 2;
            if(i-1>=0 && arr[i-1][j]=='1')visitIsland(i-1,j);
            if(i+1<r && arr[i+1][j]=='1')visitIsland(i+1,j);
            if(j-1>=0 && arr[i][j-1]=='1')visitIsland(i,j-1);
            if(j+1<c && arr[i][j+1]=='1')visitIsland(i,j+1);
        }
    }