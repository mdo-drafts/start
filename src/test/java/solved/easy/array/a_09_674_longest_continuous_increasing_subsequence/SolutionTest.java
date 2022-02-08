package solved.easy.array.a_09_674_longest_continuous_increasing_subsequence;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {
        int[] input = {1, 3, 5, 4, 7};

        int actual = sut.findLengthOfLCIS(input);

        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void test_2() {
        int[] input = {2, 2, 2, 2, 2};

        int actual = sut.findLengthOfLCIS(input);

        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void test_3() {
        int[] input = {1, 3, 5, 7};

        int actual = sut.findLengthOfLCIS(input);

        int expected = 4;

        assertEquals(expected, actual);
    }
}