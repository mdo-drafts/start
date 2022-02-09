package solved.easy.string.s_02_2042_check_if_numbers_are_ascending_in_a_sentence;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){
        String input = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";

        assertTrue(sut.areNumbersAscending(input));
    }

    @Test
    public void test_2(){
        String input = "sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s";

        assertFalse(sut.areNumbersAscending(input));
    }

    @Test
    public void test_3(){
        String input = "hello world 5 x 5";

        assertFalse(sut.areNumbersAscending(input));
    }
}