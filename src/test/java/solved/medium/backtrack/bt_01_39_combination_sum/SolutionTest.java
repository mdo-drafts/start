package solved.medium.backtrack.bt_01_39_combination_sum;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static util.Collections.asList;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {
        int[] input = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> actual = sut.combinationSum(input, target);

        List<List<Integer>> expected = asList(
                asList(2, 2, 3),
                asList(7)
        );

        assertEquals(expected, actual);
    }

    @Test
    public void test_2() {
        int[] input = {2, 3, 5};
        int target = 8;

        List<List<Integer>> actual = sut.combinationSum(input, target);

        List<List<Integer>> expected = asList(
                asList(2,2,2,2),
                asList(2,3,3),
                asList(3,5)
        );

        assertEquals(expected, actual);
    }
}