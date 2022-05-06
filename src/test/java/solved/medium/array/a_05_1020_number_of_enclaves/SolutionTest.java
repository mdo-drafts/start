package solved.medium.array.a_05_1020_number_of_enclaves;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {
        int[][] grid = {
                {0, 0, 0, 0},
                {1, 0, 1, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 0}
        };

        int actual = sut.numEnclaves(grid);

        int expected = 3;

        assertEquals(expected, actual);
    }


    @Test
    public void test_2() {
        int[][] grid = {
                {0, 1, 1, 0},
                {0, 0, 1, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 0}
        };

        int actual = sut.numEnclaves(grid);

        int expected = 0;

        assertEquals(expected, actual);
    }
}