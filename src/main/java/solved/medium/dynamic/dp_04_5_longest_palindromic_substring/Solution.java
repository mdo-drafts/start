package solved.medium.dynamic.dp_04_5_longest_palindromic_substring;

import util.Print;

public class Solution {

    public String longestPalindrome(String s) {

        int[][] matrix = new int[s.length()][s.length()];

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(s.length() - 1 - i);
            for (int j = 0; j < s.length(); j++) {
                if (curr == s.charAt(j)) {
                    matrix[i][j] = 1;
                }
            }
        }

        Print.intMatrix(matrix);

        int longest = 1;



        return "";
    }
}
