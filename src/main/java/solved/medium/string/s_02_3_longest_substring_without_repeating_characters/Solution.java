package solved.medium.string.s_02_3_longest_substring_without_repeating_characters;

import java.util.HashSet;
import java.util.Set;

//293 ms	117.7 MB
public class Solution {

    public int lengthOfLongestSubstring(String s) {

        int totalMax = 0;

        int currMax = 0;

        Set<Character> visited = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (visited.contains(s.charAt(j))) {
                    break;
                }
                currMax++;
                visited.add(s.charAt(j));
            }
            totalMax = Math.max(totalMax, currMax);
            currMax =0;
            visited = new HashSet<>();
        }
        return totalMax;
    }
}