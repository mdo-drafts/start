package solved.easy.array.a_13_1773_count_items_matching_a_rule;

import java.util.List;
import java.util.Map;

public class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        Map<String, Integer> ruleIndexMap = Map.of("type", 0, "color", 1, "name", 2);
        int ruleIndex = ruleIndexMap.get(ruleKey);

        for(List<String> item : items){
            if(item.get(ruleIndex).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}
