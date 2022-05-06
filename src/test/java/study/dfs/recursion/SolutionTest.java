package study.dfs.recursion;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;
import static util.Collections.asList;

public class SolutionTest {

    Solution sut = new Solution();


    @Test
    public void test_1() {
        List<List<Integer>> input = asList(
                asList(1, 3),
                asList(2),
                asList(1),
                asList(0)
        );


        List<Integer> actual = sut.dfs(4, input);
        List<Integer> expected = Arrays.asList(0, 1, 2, 3);

        assertEquals(expected, actual);
    }

    @Test
    public void test_2() {
        List<List<Integer>> input = asList(
                asList(1, 2, 3),
                asList(0),
                asList(0, 4),
                asList(0),
                asList(2)
        );


        List<Integer> actual = sut.dfs(4, input);
        List<Integer> expected = Arrays.asList(0, 1, 2, 4, 3);

        assertEquals(expected, actual);
    }

}