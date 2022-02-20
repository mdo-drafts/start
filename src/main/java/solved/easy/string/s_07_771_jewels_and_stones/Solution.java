package solved.easy.string.s_07_771_jewels_and_stones;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        for (char c : jewels.toCharArray()) {
            set.add(c);
        }
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (set.contains(stones.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
