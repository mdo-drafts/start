package solved.medium.string.s_01_17_letter_combinations_of_a_phone_number;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){
        String input = "23";

        List<String> actual = sut.letterCombinations(input);

        List<String> expected = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");

        assertThat(expected).hasSameElementsAs(actual);
    }

    @Test
    public void test_2(){
        String input = "";

        List<String> actual = sut.letterCombinations(input);

        List<String> expected = new ArrayList<>();

        assertThat(expected).hasSameElementsAs(actual);
    }

    @Test
    public void test_3(){
        String input = "2";

        List<String> actual = sut.letterCombinations(input);

        List<String> expected = Arrays.asList("a","b","c");

        assertThat(expected).hasSameElementsAs(actual);
    }
}