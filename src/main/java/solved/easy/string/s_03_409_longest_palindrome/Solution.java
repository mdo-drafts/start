package solved.easy.string.s_03_409_longest_palindrome;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int longestPalindrome(String s) {
        int longest = 0;

        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            int count = charCountMap.getOrDefault(c, 0);
            charCountMap.put(c, count + 1);
        }

        boolean odd = false;
        for (int value : charCountMap.values()) {
            if (value > 1) {
                if (value % 2 == 0) {
                    longest += value;
                } else {
                    longest += value - 1;
                    odd = true;
                }
            } else {
                odd = true;
            }
        }
        if (odd) {
            longest++;
        }
        return longest;
    }
}
