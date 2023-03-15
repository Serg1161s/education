package leetcode.graph.flood_fill;

import java.util.Arrays;

public class MainApp {

    public static void main(String[] args) {

        int [][] image = {
                {1, 1, 1, 1,1,1,1,1},
                {1, 0, 0, 1,1,1,1,1 },
                {1, 0, 1, 1,1,1,1,1}
        };
        FloodFill floodFill = new FloodFill();
        image = floodFill.floodFill(image,1,1,2);

        for (int i = 0; i < image.length; i++) {
            System.out.println(Arrays.toString(image[i]));
        }

    }

}
