package solved.easy.array.a_11_832_flipping_an_image;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {
        int[][] input = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};

        int[][] actual = sut.flipAndInvertImage(input);

        int[][] expected = {{1, 0, 0}, {0, 1, 0}, {1, 1, 1}};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void test_2() {
        int[][] input = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};

        int[][] actual = sut.flipAndInvertImage(input);

        int[][] expected = {{1, 1, 0, 0}, {0, 1, 1, 0}, {0, 0, 0, 1}, {1, 0, 1, 0}};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void test_3() {
        int[][] input = {{1}};

        int[][] actual = sut.flipAndInvertImage(input);

        int[][] expected = {{0}};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void test_4() {
        int[][] input = {{1}, {1}, {1}, {1}};

        int[][] actual = sut.flipAndInvertImage(input);

        int[][] expected = {{0}, {0}, {0}, {0}};

        assertArrayEquals(expected, actual);
    }
}