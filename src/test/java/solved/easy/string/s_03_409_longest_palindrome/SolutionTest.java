package solved.easy.string.s_03_409_longest_palindrome;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {
        String input = "abccccdd";

        int actual = sut.longestPalindrome(input);

        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    public void test_2() {
        String input = "abcdef";

        int actual = sut.longestPalindrome(input);

        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void test_3() {
        String input = "dd";

        int actual = sut.longestPalindrome(input);

        int expected = 2;

        assertEquals(expected, actual);
    }
}