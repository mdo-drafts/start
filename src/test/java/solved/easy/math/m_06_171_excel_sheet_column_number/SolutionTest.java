package solved.easy.math.m_06_171_excel_sheet_column_number;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){

        int actual = sut.titleToNumber("AB");
        int expected = 28;

        assertEquals(expected, actual);
    }

    @Test
    public void test_2(){

        int actual = sut.titleToNumber("AA");
        int expected = 27;

        assertEquals(expected, actual);
    }

    @Test
    public void test_3(){

        int actual = sut.titleToNumber("A");
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void test_4(){

        int actual = sut.titleToNumber("ZY");
        int expected = 701;

        assertEquals(expected, actual);
    }

    @Test
    public void test_5(){

        int actual = sut.titleToNumber("AAA");
        int expected = 703;

        assertEquals(expected, actual);
    }
}