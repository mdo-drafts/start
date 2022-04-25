package solved.medium.dynamic.dp_01_1143_longest_common_subsequence;

public class Solution {
    //abcdefghl
    //zbegw
    public int longestCommonSubsequence(String text1, String text2) {
        int p1 = 0;

        int totalCount = 0;
        int count = 0;

        for (int k = 0; k < text2.length(); k++) {
            for (int i = k; i < text2.length(); i++) {
                char curr = text2.charAt(i);
                for (int j = p1; j < text1.length(); j++) {
                    char currT1 = text1.charAt(j);
                    if (curr == currT1) {
                        System.out.println(curr);
                        count++;
                        p1 = j + 1;
                        break;
                    }
                }
            }
            totalCount = Math.max(totalCount, count);
            p1 = 0;
            count = 0;
        }

        return totalCount;
    }
}
