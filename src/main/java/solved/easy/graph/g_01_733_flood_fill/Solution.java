package solved.easy.graph.g_01_733_flood_fill;

public class Solution {

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        boolean[][] visited = new boolean[image.length][image[0].length];
        int currColor = image[sr][sc];
        fill(image, visited, sr, sc, currColor, newColor);
        return image;
    }

    private void fill(int[][] image, boolean[][] visited, int sr, int sc, int currColor, int newColor) {
        if (sr < 0 || sc < 0) {
            return;
        }
        if (image.length - 1 < sr || image[0].length - 1 < sc) {
            return;
        }
        if(visited[sr][sc]){
            return;
        }

        if (image[sr][sc] != currColor) {
            return;
        }

        image[sr][sc] = newColor;
        visited[sr][sc] = true;
        fill(image, visited,sr - 1, sc, currColor, newColor);
        fill(image, visited, sr, sc - 1, currColor, newColor);
        fill(image, visited,sr + 1, sc, currColor, newColor);
        fill(image, visited, sr, sc + 1, currColor, newColor);

    }
}
