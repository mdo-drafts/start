package solved.easy.array.a_05_422_valid_word_square;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){
        List<String> input = Arrays.asList("abcd","bnrt","crmy","dtye");
        assertTrue(sut.validWordSquare(input));

    }

    @Test
    public void test_2(){
        List<String> input = Arrays.asList("abcd","bnrt","crm","dt");
        assertTrue(sut.validWordSquare(input));
    }

    @Test
    public void test_3(){
        List<String> input = Arrays.asList("ball","area","read","lady");
        assertFalse(sut.validWordSquare(input));

    }
    //["ball","asee","let","lep"]

    @Test
    public void test_4(){
        List<String> input = Arrays.asList("ball","asee","let","lep");
        assertFalse(sut.validWordSquare(input));

    }

    //["abc","b"]
    @Test
    public void test_5(){
        List<String> input = Arrays.asList("abc","b");
        assertFalse(sut.validWordSquare(input));

    }

}