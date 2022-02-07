package solved.easy.array.a_06_1002_find_common_characters;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){
        String[] input = {"bella","label","roller"};

        List<String> expected = Arrays.asList("e","l","l");

        List<String> actual = sut.commonChars(input);

        assertThat(expected).hasSameElementsAs(actual);
    }

    @Test
    public void test_2(){
        String[] input = {"cool","lock","cook"};

        List<String> expected = Arrays.asList("c","o");

        List<String> actual = sut.commonChars(input);

        assertThat(expected).hasSameElementsAs(actual);
    }

}