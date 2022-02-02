package solved.medium.array.a_01_46_permutations;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.Assert.assertEquals;
import static util.Collections.asList;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {
        int[] input = {1, 2, 3};

        List<List<Integer>> expected = asList(
                asList(1, 2, 3),
                asList(1, 3, 2),
                asList(2, 1, 3),
                asList(2, 3, 1),
                asList(3, 1, 2),
                asList(3, 2, 1)
        );

        List<List<Integer>> actual = sut.permute(input);

        assertEquals(expected, actual);

    }

    @Test
    public void test_2() {
        int[] input = {1};

        List<List<Integer>> expected = asList(
                asList(1)
        );

        List<List<Integer>> actual = sut.permute(input);

        assertEquals(expected, actual);
    }
}