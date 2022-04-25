package solved.medium.dynamic.dp_04_5_longest_palindromic_substring;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){
        String input = "babad";

        sut.longestPalindrome(input);

    }

}