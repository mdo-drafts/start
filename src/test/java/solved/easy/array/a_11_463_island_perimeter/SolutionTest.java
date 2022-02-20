package solved.easy.array.a_11_463_island_perimeter;

import org.junit.Test;
import unsolved.easy.graph.g_01_463_island_perimeter.Solution;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {
        int[][] input = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};

        int actual = sut.islandPerimeter(input);

        int expected = 16;

        assertEquals(expected, actual);
    }

    @Test
    public void test_2() {
        int[][] input = {{1}};

        int actual = sut.islandPerimeter(input);

        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    public void test_3() {
        int[][] input = {{1, 0}};

        int actual = sut.islandPerimeter(input);

        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    public void test_4() {
        int[][] input = {{0, 1}};

        int actual = sut.islandPerimeter(input);

        int expected = 4;

        assertEquals(expected, actual);
    }
}