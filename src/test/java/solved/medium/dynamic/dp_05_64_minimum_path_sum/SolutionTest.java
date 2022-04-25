package solved.medium.dynamic.dp_05_64_minimum_path_sum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {
        int[][] input = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        int actual = sut.minPathSum(input);
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    public void test_2() {
        int[][] input = {{1,2,3}, {4,5,6}};
        int actual = sut.minPathSum(input);
        int expected = 12;
        assertEquals(expected, actual);
    }
}