package solved.medium.dynamic.dp_03_120_triangle;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static util.Collections.asList;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {
        List<List<Integer>> input = asList(
                asList(2),
                asList(3, 4),
                asList(6, 5, 7),
                asList(4, 1, 8, 3)
        );
        int actual = sut.minimumTotal(input);
        int expected = 11;
        assertEquals(expected, actual);
    }

    @Test
    public void test_2() {
        List<List<Integer>> input = asList(
                asList(-10)
        );
        int actual = sut.minimumTotal(input);
        int expected = -10;
        assertEquals(expected, actual);
    }
}