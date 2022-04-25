package solved.medium.dynamic.dp_06_131_palindrome_partitioning;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<String>> partition(String s) {

        int[][] matrix = new int[s.length()][s.length()];

        int i = 0;
        for (int b = s.length() - 1; 0 <= b; b--) {
            char curr = s.charAt(b);
            for (int j = 0; j < s.length(); j++) {
                if (curr == s.charAt(j)) {
                    matrix[i][j] = 1;
                }
            }
            i++;
        }


        List<List<String>> result = new ArrayList<>();
        List<String> tmp = new ArrayList<>();
        for (char c : s.toCharArray()) {
            tmp.add(String.valueOf(c));
        }
        result.add(tmp);

        int j;
        tmp = new ArrayList<>();
        for (int k = (-matrix.length) + 1; k < matrix.length; k++) {
            if (0 < k) {
                j = k;
            } else {
                j = 0;
            }
            if (k <= 0) {
                i = Math.abs(k);
            } else {
                i = 0;
            }
            int start = -1;
            while (i < matrix.length && j < matrix.length) {
                if (matrix[i][j] == 1 && start == -1) {
                    start = j;
                }
                if (matrix[i][j] == 0 && start != -1) {
                    tmp.add(s.substring(start, j + 1));
                    start = -1;
                }
                i++;
                j++;
            }
        }
        result.add(tmp);

        return result;
    }
}
