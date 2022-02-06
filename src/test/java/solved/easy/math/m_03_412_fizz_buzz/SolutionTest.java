package solved.easy.math.m_03_412_fizz_buzz;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {
        int input = 15;
        List<String> expected = Arrays.asList("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz");

        List<String> actual = sut.fizzBuzz(input);

        assertEquals(expected, actual);
    }

}