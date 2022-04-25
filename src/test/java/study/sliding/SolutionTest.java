package study.sliding;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

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
}