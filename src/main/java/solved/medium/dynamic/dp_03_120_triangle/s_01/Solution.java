package solved.medium.dynamic.dp_03_120_triangle.s_01;

import java.util.Collections;
import java.util.List;

//8 ms	45 MB
public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle.size() == 1) {
            Collections.min(triangle.get(0));
        }

        for (int i = triangle.size() - 2; 0 <= i; i--) {
            List<Integer> prev = triangle.get(i + 1);
            List<Integer> curr = triangle.get(i);
            for (int j = 0; j < curr.size(); j++) {
                int currNum = curr.get(j);
                curr.set(j, Math.min(currNum + prev.get(j), currNum + prev.get(j + 1)));
            }
        }
        return triangle.get(0).get(0);
    }
}
