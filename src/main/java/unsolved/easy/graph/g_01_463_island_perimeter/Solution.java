package unsolved.easy.graph.g_01_463_island_perimeter;

public class Solution {
    public int islandPerimeter(int[][] grid) {

        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {

                if (grid[i][j] == 1) {
                    if (j - 1 < 0) {
                        count++;
                    }
                    if (j + 1 == grid[0].length) {
                        count++;
                    }
                    if (j - 1 >= 0) {
                        if (grid[i][j - 1] == 0) {
                            count++;
                        }
                    }
                    if (j + 1 < grid[0].length) {
                        if (grid[i][j + 1] == 0) {
                            count++;
                        }
                    }
                }

                if (grid[j][i] == 1) {
                    if (j - 1 < 0) {
                        count++;
                    }
                    if(j + 1 == grid.length){
                        count++;
                    }
                    if (j - 1 >= 0) {
                        if (grid[j - 1][i] == 0) {
                            count++;
                        }
                    }
                    if (j + 1 < grid.length) {
                        if (grid[j + 1][i] == 0) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}

/*

 for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j] == 1 && (i - 1 == 0 || i + 1 == grid[0].length || grid[i - 1][j] == 0 || grid[i + 1][j] == 0)) {

                }
            }
        }

 */
