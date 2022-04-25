package solved.medium.dynamic.dp_03_120_triangle;

import java.util.List;


//4 ms	44.3 MB
public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        for (int i = triangle.size() - 2; 0 <= i; i--) {
            List<Integer> prev = triangle.get(i + 1);
            List<Integer> curr = triangle.get(i);
            for (int j = 0; j < curr.size(); j++) {
                int currNum = curr.get(j);
                curr.set(j, currNum + Math.min(prev.get(j), prev.get(j + 1)));
            }
        }
        return triangle.get(0).get(0);
    }
}
