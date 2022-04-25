package solved.easy.string.s_09_389_find_the_difference;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public char findTheDifference(String s, String t) {
        if (s.isEmpty()) {
            return t.charAt(0);
        }

        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            int count = map.getOrDefault(c, 0);
            count++;
            map.put(c, count);
        }
        for (char c : t.toCharArray()) {
            if(!map.containsKey(c)){
                return c;
            }
            int count = map.get(c);
            count--;
            map.put(c, count);

        }
        char result = 0;
        for( Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == -1){
                return entry.getKey();
            }

        }
        return result;
    }
}
