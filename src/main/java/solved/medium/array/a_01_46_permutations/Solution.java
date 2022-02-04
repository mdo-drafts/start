package solved.medium.array.a_01_46_permutations;

import java.util.ArrayList;
import java.util.List;

public class Solution {


    public List<List<Integer>> permute(int[] nums) {
        List<Integer> inputList = new ArrayList<>();
        for (int num : nums) {
            inputList.add(num);
        }
        return permuteList(inputList);

    }


    public List<List<Integer>> permuteList(List<Integer> list) {
        List<List<Integer>> result = new ArrayList<>();
        if (list.size() == 1) {
            result.add(list);
            return result;
        }

        if (list.size() == 2) {
            result.add(new ArrayList<>(List.of(list.get(0), list.get(1))));
            result.add(new ArrayList<>(List.of(list.get(1), list.get(0))));
            return result;
        }

        for (int i = 0; i < list.size(); i++) {
            List<Integer> copy = new ArrayList<>(list);
            Integer toAdd = copy.remove(i);
            List<List<Integer>> permutedLists = permuteList(copy);
            for (List<Integer> permutedList : permutedLists) {
                permutedList.add(0, toAdd);
                result.add(permutedList);
            }
        }
        return result;
    }
}
