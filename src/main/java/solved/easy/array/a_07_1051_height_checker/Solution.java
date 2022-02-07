package solved.easy.array.a_07_1051_height_checker;

import java.util.Arrays;

public class Solution {

    public int heightChecker(int[] heights) {
        int[] expected = Arrays.copyOf(heights, heights.length);
        Arrays.sort(expected);

        int count = 0;

        for (int i = 0; i < heights.length; i++) {
            if (expected[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }
}
