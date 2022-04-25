package solved.medium.dynamic.dp_03_120_triangle.s_02;

import java.util.List;

//6 ms	44.1 MB
public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        for (int i = triangle.size() - 2; 0 <= i; i--) {
            for (int j = 0; j <= i; j++) {
                int currNum = triangle.get(i).get(j);
                triangle.get(i).set(j, currNum + Math.min(triangle.get(i + 1).get(j), triangle.get(i + 1).get(j + 1)));
            }
        }
        return triangle.get(0).get(0);
    }
}
