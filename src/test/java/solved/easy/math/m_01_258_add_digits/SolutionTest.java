package solved.easy.math.m_01_258_add_digits;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){
        int input = 38;
        int expected = 2;
        int actual = sut.addDigits(input);

        assertEquals(expected, actual);
    }


    @Test
    public void test_2(){
        int input = 0;
        int expected = 0;
        int actual = sut.addDigits(input);

        assertEquals(expected, actual);
    }
}