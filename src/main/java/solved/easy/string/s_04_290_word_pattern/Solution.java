package solved.easy.string.s_04_290_word_pattern;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean wordPattern(String pattern, String s) {

        Map<Character, String> patternToStr = new HashMap<>();

        String[] strArr = s.split(" ");
        char[] patternArr = pattern.toCharArray();

        if (pattern.length() != strArr.length) {
            return false;
        }
        for (int i = 0; i < patternArr.length; i++) {
            char curr = patternArr[i];
            if (!patternToStr.containsKey(curr)) {
                if (patternToStr.containsValue(strArr[i])) {
                    return false;
                }
                patternToStr.put(curr, strArr[i]);
            } else {
                String str = patternToStr.get(curr);
                if (!str.equals(strArr[i])) {
                    return false;
                }
            }
        }
        return true;
    }
}
/*

   Map<String, Character> strToPattern = new HashMap<>();

        String[] strArr = s.split(" ");
        char[] patternArr = pattern.toCharArray();

        if (pattern.length() != strArr.length) {
            return false;
        }
        for (int i = 0; i < strArr.length; i++) {
            String currStr = strArr[i];
            if (!strToPattern.containsKey(currStr)) {
                strToPattern.put(currStr, patternArr[i]);
            } else {
                char c = strToPattern.get(currStr);
                if (c != patternArr[i]) {
                    return false;
                }
            }
        }
        return true;


 */