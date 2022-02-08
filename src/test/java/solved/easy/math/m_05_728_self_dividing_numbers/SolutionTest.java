package solved.easy.math.m_05_728_self_dividing_numbers;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {
        int left = 1;
        int right = 22;

        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22);

        List<Integer> actual = sut.selfDividingNumbers(left, right);

        assertThat(expected).hasSameElementsAs(actual);
    }

    @Test
    public void test_2() {
        int left = 47;
        int right = 85;

        List<Integer> expected = Arrays.asList(48,55,66,77);

        List<Integer> actual = sut.selfDividingNumbers(left, right);

        assertThat(expected).hasSameElementsAs(actual);
    }
}