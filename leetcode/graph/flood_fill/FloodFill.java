package leetcode.graph.flood_fill;

public class FloodFill {
    protected int[][] floodFill(int[][] image, int sr, int sc, int newColor){

        int color = image[sr][sc];
       if (color != newColor) {
           changeColor (image,sr,sc,color, newColor);
       }

        return image;

    }
    private void changeColor (int [][] image, int i, int j, int color, int newColor) {
        if (image[i][j] == color) {
            image[i][j] = newColor;

            if (i >= 1) changeColor(image, i - 1, j, color, newColor);
            if (j >= 1) changeColor(image, i, j - 1, color, newColor);
            if ((i + 1) < image.length) changeColor(image, i + 1, j, color, newColor);
            if ((j + 1) < image[0].length) changeColor(image, i, j + 1, color, newColor);
        }
    }

}
