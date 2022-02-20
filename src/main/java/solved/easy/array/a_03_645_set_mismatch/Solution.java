package solved.easy.array.a_03_645_set_mismatch;

import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            int count = map.getOrDefault(nums[i], 0);
            map.put(nums[i], count + 1);
        }
        int i = 1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 2) {
                result[0] = entry.getKey();
            }
            if (entry.getKey() != i) {
                if (result[1] == 0) {
                    result[1] = i;
                }
            }
            i++;
        }
        if (result[1] == 0) {
            result[1] = map.lastKey() + 1;
        }
        return result;
    }
}


