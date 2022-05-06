package solved.medium.array.a_05_1020_number_of_enclaves;

public class Solution {

    int count = 0;

    public int numEnclaves(int[][] grid) {
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    boolean canMove = calc(grid, i, j);
                    if (canMove) {
                        result += count;
                    }
                    count = 0;
                }
            }
        }
        return result;
    }

    private boolean calc(int[][] grid, int sr, int sc) {
        if (sr < 0 || sc < 0 || grid.length - 1 < sr || grid[sr].length - 1 < sc) {
            return false;
        }
        if (grid[sr][sc] == 0) {
            return true;
        }
        grid[sr][sc] = 0;
        count++;

        return calc(grid, sr - 1, sc) &
                calc(grid, sr, sc - 1) &
                calc(grid, sr + 1, sc) &
                calc(grid, sr, sc + 1);
    }
}
