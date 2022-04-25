package solved.easy.array.matrix.am_02_1351_count_negative_numbers_in_a_sorted_matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] < 0) count++;
            }
        }
        return count;
    }
}

/*
      int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] < 0) count++;
            }
        }
        return count;


 */
