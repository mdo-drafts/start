package solved.easy.dynamic.dp_01_118_pascal_triangle;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static util.Collections.asList;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {
        int input = 1;
        List<List<Integer>> actual = sut.generate(input);

        List<List<Integer>> expected = asList(
                asList(1)
        );

        assertEquals(expected, actual);
    }


    @Test
    public void test_2() {
        int input = 2;
        List<List<Integer>> actual = sut.generate(input);

        List<List<Integer>> expected = asList(
                asList(1),
                asList(1, 1)
        );

        assertEquals(expected, actual);
    }

    @Test
    public void test_3() {
        int input = 5;
        List<List<Integer>> actual = sut.generate(input);

        List<List<Integer>> expected = asList(
                asList(1),
                asList(1, 1),
                asList(1,2,1),
                asList(1,3,3,1),
                asList(1,4,6,4,1)
        );

        assertEquals(expected, actual);
    }
}