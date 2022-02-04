package solved.easy.math.m_02_509_fibonacci_number;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){
        int input = 4;
        int expected = 3;
        int actual = sut.fib(input);
        assertEquals(expected, actual);
    }

}