package leetcode.graph.num_is_land;

import leetcode.graph.flood_fill.FloodFill;

import java.util.Arrays;

public class MainApp {

    public static void main(String[] args) {

        char [][] image = {
                {'1','0', '1', '1'},
                {'0', '0', '0', '1'},
                {'1', '0', '1', '1'}
        };
        NumIsLand numIsLand = new NumIsLand();
        int answer = numIsLand.numIslands(image);

        System.out.println(answer);

    }

}
