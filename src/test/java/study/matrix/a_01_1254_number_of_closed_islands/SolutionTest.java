package study.matrix.a_01_1254_number_of_closed_islands;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {
        int[][] grid = {
                {1, 1, 1, 1, 1},
                {1, 0, 0, 0, 1},
                {1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1}
        };

        int actual = sut.closedIsland(grid);

        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void test_2() {
        int[][] grid = {
                {1, 1, 1, 1, 1, 1},
                {1, 0, 0, 0, 1, 1},
                {1, 1, 1, 1, 0, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1}
        };

        int actual = sut.closedIsland(grid);

        int expected = 2;

        assertEquals(expected, actual);
    }

}