package solved.medium.graph.g_04_684_redundant_connection;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {
        int[][] edges = {{1, 2}, {1, 3}, {2, 3}};

        int[] actual = sut.findRedundantConnection(edges);
        int[] expected = {2, 3};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void test_2() {
        int[][] edges = {{1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}};

        int[] actual = sut.findRedundantConnection(edges);
        int[] expected = {1, 4};

        assertArrayEquals(expected, actual);
    }
}