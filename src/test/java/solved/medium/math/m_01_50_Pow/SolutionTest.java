package solved.medium.math.m_01_50_Pow;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){

        double actual = sut.myPow( 2.00000, 10);
        double expected = 1024.00000;
        assertEquals(expected, actual, 0);
    }

    @Test
    public void test_2(){

        double actual = sut.myPow( 2.10000, 3);
        double expected = 9.26100;
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void test_3(){

        double actual = sut.myPow( 2.00000, -2);
        double expected = 0.25000;
        assertEquals(expected, actual, 0.0001);
    }
}