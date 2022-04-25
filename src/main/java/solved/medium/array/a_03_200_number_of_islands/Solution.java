package solved.medium.array.a_03_200_number_of_islands;

//3 ms	57.1 MB
public class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    check(grid, i, j);
                }
            }
        }
        return count;
    }

    private void check(char[][] grid, int sr, int sc) {
        if (sr < 0 || sc < 0) {
            return;
        }

        if (grid.length - 1 < sr || grid[sr].length - 1 < sc) {
            return;
        }
        if (grid[sr][sc] == '0') {
            return;
        }
        grid[sr][sc] = '0';
        check(grid, sr - 1, sc);
        check(grid, sr, sc - 1);
        check(grid, sr + 1, sc);
        check(grid, sr, sc + 1);
    }
}

