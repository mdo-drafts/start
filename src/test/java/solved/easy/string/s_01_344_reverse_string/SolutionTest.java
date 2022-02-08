package solved.easy.string.s_01_344_reverse_string;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){
        char[] input = {'h','e','l','l','o'};

        char[] expected = {'o','l','l','e','h'};

        sut.reverseString(input);

        assertArrayEquals(expected, input);
    }

}