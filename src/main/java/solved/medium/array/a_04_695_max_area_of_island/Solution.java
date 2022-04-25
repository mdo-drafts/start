package solved.medium.array.a_04_695_max_area_of_island;

public class Solution {

    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    int currArea = calcArea(grid, i, j);
                    maxArea = Math.max(maxArea, currArea);
                }
            }
        }
        return maxArea;
    }

    private int calcArea(int[][] grid, int sr, int sc) {
        if (sr < 0 || sc < 0 || grid.length - 1 < sr || grid[sr].length - 1 < sc) {
            return 0;
        }
        if (grid[sr][sc] == 0) {
            return 0;
        }
        grid[sr][sc] = 0;
        return 1 + calcArea(grid, sr - 1, sc)
                + calcArea(grid, sr, sc - 1)
                + calcArea(grid, sr + 1, sc)
                + calcArea(grid, sr, sc + 1);
    }
}
