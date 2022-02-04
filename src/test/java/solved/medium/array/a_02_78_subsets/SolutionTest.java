package solved.medium.array.a_02_78_subsets;

import org.junit.Test;
import solved.medium.array.a_02_78_subsets.s_1.Solution;

import java.util.List;

import static org.junit.Assert.*;
import static util.Collections.asList;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1(){

        int[] input = {1, 2, 3};

        List<List<Integer>> expected = asList(
                asList(),
                asList(1),
                asList(2),
                asList(1, 2),
                asList(3),
                asList(1, 3),
                asList(2, 3),
                asList(1, 2, 3)
        );

        List<List<Integer>> actual = sut.subsets(input);

        assertEquals(expected, actual);
    }


}