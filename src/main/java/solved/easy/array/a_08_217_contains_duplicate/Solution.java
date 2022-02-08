package solved.easy.array.a_08_217_contains_duplicate;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> existed = new HashSet<>();
        for(int num : nums){
            if(existed.contains(num)){
                return true;
            }else{
                existed.add(num);
            }
        }
        return false;
    }
}
