package solved.easy.array.a_10_682_baseball_game;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {
        String[] ops = {"5", "5", "+"};

        int actual = sut.calPoints(ops);

        int expected = 20;

        assertEquals(expected, actual);
    }

    @Test
    public void test_2() {
        String[] ops = {"5", "5", "D"};

        int actual = sut.calPoints(ops);

        int expected = 20;

        assertEquals(expected, actual);
    }

    @Test
    public void test_3() {
        String[] ops = {"5", "6", "+"};

        int actual = sut.calPoints(ops);

        int expected = 22;

        assertEquals(expected, actual);
    }

    @Test
    public void test_4() {
        String[] ops = {"5", "6", "D"};

        int actual = sut.calPoints(ops);

        int expected = 23;

        assertEquals(expected, actual);
    }
}