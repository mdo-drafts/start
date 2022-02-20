package solved.easy.array.a_12_941_valid_mountain_array;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {
        int[] input = {0, 3, 2, 1};
        assertTrue(sut.validMountainArray(input));
    }

    @Test
    public void test_2() {
        int[] input = {2};
        assertFalse(sut.validMountainArray(input));
    }

    @Test
    public void test_3() {
        int[] input = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertFalse(sut.validMountainArray(input));
    }
}