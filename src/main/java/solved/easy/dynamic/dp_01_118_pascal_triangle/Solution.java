package solved.easy.dynamic.dp_01_118_pascal_triangle;

import java.util.ArrayList;
import java.util.List;

//1 ms	41.3 MB
public class Solution {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < 2 && i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                row.add(1);
            }
            result.add(row);
        }

        for (int i = 2; i < numRows; i++) {
            List<Integer> prev = result.get(i - 1);
            List<Integer> current = new ArrayList<>();
            current.add(1);
            for (int j = 1; j < i; j++) {
                current.add(prev.get(j) + prev.get(j - 1));
            }
            current.add(1);
            result.add(current);
        }

        return result;
    }
}
