package solved.easy.array.matrix.am_02_1351_count_negative_numbers_in_a_sorted_matrix;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {
        int[][] input = {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
        int actual = sut.countNegatives(input);
        int expected = 8;

        assertEquals(expected, actual);
    }
}