package solved.easy.array.a_07_1051_height_checker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {
        int[] input = {1, 1, 4, 2, 1, 3};
        int expected = 3;
        int actual = sut.heightChecker(input);

        assertEquals(expected, actual);
    }

    @Test
    public void test_2() {
        int[] input = {5, 1, 2, 3, 4};
        int expected = 5;
        int actual = sut.heightChecker(input);

        assertEquals(expected, actual);
    }

    @Test
    public void test_3() {
        int[] input = {1, 2, 3, 4, 5};
        int expected = 0;
        int actual = sut.heightChecker(input);

        assertEquals(expected, actual);
    }
}