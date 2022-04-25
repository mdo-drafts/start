package solved.easy.array.a_13_1773_count_items_matching_a_rule;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution sut = new Solution();

    @Test
    public void test_1() {
        List<List<String>> items = List.of(
                List.of("phone", "blue", "pixel"),
                List.of("computer", "silver", "lenovo"),
                List.of("phone", "gold", "iphone")
        );

        String ruleKey = "color";

        String ruleValue = "silver";

        int actual = sut.countMatches(items, ruleKey, ruleValue);

        int expected = 1;

        assertEquals(expected, actual);
    }
}