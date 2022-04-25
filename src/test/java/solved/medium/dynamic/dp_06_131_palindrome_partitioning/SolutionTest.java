package solved.medium.dynamic.dp_06_131_palindrome_partitioning;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {

        String input = "aab";
        List<List<String>> actual = sut.partition(input);

        List<List<String>> expected = List.of(
                List.of("a","a","b"),
                List.of("aa","b")
        );

        assertEquals(expected, actual);
    }
}