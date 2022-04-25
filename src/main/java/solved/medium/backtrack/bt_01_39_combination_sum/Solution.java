package solved.medium.backtrack.bt_01_39_combination_sum;

import java.util.ArrayList;
import java.util.List;

//8 ms	44.7 MB
public class Solution {
    List<List<Integer>> result = new ArrayList<>();
    int currSum = 0;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> current = new ArrayList<>();

        backtrack(current, candidates, target, 0);
        return result;
    }

    private void backtrack(List<Integer> current, int[] candidates, int target, int start) {
        for (int i = start; i < candidates.length; i++) {
            currSum += candidates[i];
            current.add(candidates[i]);
            if (currSum < target) {
                backtrack(current, candidates, target, i);
            }
            if (currSum == target) {
                result.add(new ArrayList<>(current));
            }
            current.remove(current.size() - 1);
            currSum -= candidates[i];
        }
    }

}

