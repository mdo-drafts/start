package solved.medium.dynamic.dp_05_64_minimum_path_sum;

//6 ms	45.6 MB
public class Solution {

    public int minPathSum(int[][] grid) {

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i - 1 < 0 && j - 1 < 0) {
                    continue;
                }
                if (j - 1 < 0) {
                    grid[i][j] = grid[i][j] + grid[i - 1][j];
                    continue;
                }
                if (i - 1 < 0) {
                    grid[i][j] = grid[i][j] + grid[i][j - 1];
                    continue;
                }
                grid[i][j] = grid[i][j] + Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        return grid[grid.length - 1][grid[0].length - 1];
    }
}
