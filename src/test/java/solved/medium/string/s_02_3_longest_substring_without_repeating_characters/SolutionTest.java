package solved.medium.string.s_02_3_longest_substring_without_repeating_characters;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {

        String input = "abcabcbb";

        int actual = sut.lengthOfLongestSubstring(input);

        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void test_2() {

        String input = "pwwkew";

        int actual = sut.lengthOfLongestSubstring(input);

        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void test_3() {

        String input = "bbbbb";

        int actual = sut.lengthOfLongestSubstring(input);

        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void test_4() {

        String input = " ";

        int actual = sut.lengthOfLongestSubstring(input);

        int expected = 1;

        assertEquals(expected, actual);
    }
}