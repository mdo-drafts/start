package study.array.bfs;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {
        int[][] matrix = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};

        List<Integer> actual = sut.bfs(matrix);

        List<Integer> expected = Arrays.asList(1, 2, 5, 3, 6, 9, 4, 7, 10, 13, 8, 11, 14, 12, 15, 16);

        assertThat(expected).hasSameElementsAs(actual);
    }
}