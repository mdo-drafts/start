package solved.easy.string.s_04_290_word_pattern;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){
        String pattern ="abba";
        String str = "dog cat cat dog";

        assertTrue(sut.wordPattern(pattern, str));
    }

    @Test
    public void test_2(){
        String pattern ="abba";
        String str = "dog cat cat fish";

        assertFalse(sut.wordPattern(pattern, str));
    }

    @Test
    public void test_3(){
        String pattern ="aaaa";
        String str = "dog cat cat dog";

        assertFalse(sut.wordPattern(pattern, str));
    }

    @Test
    public void test_4(){
        String pattern ="abba";
        String str = "dog dog dog dog";

        assertFalse(sut.wordPattern(pattern, str));
    }
}