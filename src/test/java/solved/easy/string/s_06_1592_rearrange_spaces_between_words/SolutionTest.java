package solved.easy.string.s_06_1592_rearrange_spaces_between_words;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){
        String input = "  this   is  a sentence ";

        String actual = sut.reorderSpaces(input);

        String expected = "this   is   a   sentence";

        assertEquals(expected, actual);
    }

    @Test
    public void test_2(){
        String input = " practice   makes   perfect";

        String actual = sut.reorderSpaces(input);

        String expected = "practice   makes   perfect ";

        assertEquals(expected, actual);
    }

    @Test
    public void test_3(){
        String input = "  practice";

        String actual = sut.reorderSpaces(input);

        String expected = "practice  ";

        assertEquals(expected, actual);
    }

}