package solved.easy.math.m_04_268_missing_number;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {
        int[] input = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int expected = 8;
        int actual = sut.missingNumber(input);
        assertEquals(expected, actual);
    }

    @Test
    public void test_2() {
        int[] input = {0, 1};
        int expected = 2;
        int actual = sut.missingNumber(input);
        assertEquals(expected, actual);
    }
}