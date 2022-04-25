package solved.easy.graph.g_01_733_flood_fill;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {

        int[][] image = {{1, 1, 1},{1, 1, 0},{1, 0, 1}};
        int sr = 1;
        int sc = 1;
        int newColor = 2;

        int[][] actual = sut.floodFill(image, sr, sc, newColor);

        int[][] expected = {{2,2,2},{2,2,0},{2,0,1}};

        assertArrayEquals(expected, actual);
    }


    @Test
    public void test_2() {

        int[][] image = {{0, 0, 0},{0, 0, 0}};
        int sr = 0;
        int sc = 0;
        int newColor = 2;

        int[][] actual = sut.floodFill(image, sr, sc, newColor);

        int[][] expected = {{2,2,2},{2,2,2}};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void test_3() {

        int[][] image = {{0, 0, 0},{0, 1, 1}};
        int sr = 1;
        int sc = 1;
        int newColor = 1;

        int[][] actual = sut.floodFill(image, sr, sc, newColor);

        int[][] expected = {{0, 0, 0},{0, 1, 1}};

        assertArrayEquals(expected, actual);
    }
}