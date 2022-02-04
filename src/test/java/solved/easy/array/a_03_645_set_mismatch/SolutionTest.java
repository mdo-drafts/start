package solved.easy.array.a_03_645_set_mismatch;

import org.junit.Test;
import solved.easy.array.a_03_645_set_mismatch.s_1.Solution;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {
        int[] input = {1, 2, 2, 4};

        int[] expected = {2, 3};

        int[] actual = sut.findErrorNums(input);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void test_2() {
        int[] input = {1, 1};

        int[] expected = {1, 2};

        int[] actual = sut.findErrorNums(input);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void test_3() {
        int[] input = {2, 2};

        int[] expected = {2, 1};

        int[] actual = sut.findErrorNums(input);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void test_4() {
        int[] input = {3, 2, 2};

        int[] expected = {2, 1};

        int[] actual = sut.findErrorNums(input);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void test_5() {
        int[] input = {1, 3, 3};

        int[] expected = {3, 2};

        int[] actual = sut.findErrorNums(input);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void test_6() {
        int[] input = {3,2,3,4,6,5};

        int[] expected = {3, 1};

        int[] actual = sut.findErrorNums(input);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void test_7() {
        int[] input = {1,5,3,2,2,7,6,4,8,9};

        int[] expected = {2, 10};

        int[] actual = sut.findErrorNums(input);

        assertArrayEquals(expected, actual);
    }
}