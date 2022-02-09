package solved.easy.string.s_05_1528_shuffle_string;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){
        String str = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};

        String actual = sut.restoreString(str, indices);

        String expected = "leetcode";

        assertEquals(expected, actual);
    }

    @Test
    public void test_2(){
        String str = "abc";
        int[] indices = {0,1,2};

        String actual = sut.restoreString(str, indices);

        String expected = "abc";

        assertEquals(expected, actual);
    }
}