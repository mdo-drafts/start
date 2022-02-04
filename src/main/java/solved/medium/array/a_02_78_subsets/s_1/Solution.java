package solved.medium.array.a_02_78_subsets.s_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    Set<List<Integer>> cache = new HashSet<>();

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> inputList = new ArrayList<>();
        for (int num : nums) {
            inputList.add(num);
        }
        List<List<Integer>> result = subset(inputList);
        result.add(0, new ArrayList<>());
        return result;
    }

    private List<List<Integer>> subset(List<Integer> subset) {
        List<List<Integer>> result = new ArrayList<>();
        if (subset.size() == 1) {
            result.add(subset);
            return result;
        }
        for (int i = 0; i < subset.size(); i++) {
            List<Integer> copy = new ArrayList<>(subset);
            copy.remove(i);
            if(!cache.contains(copy)){
                List<List<Integer>> subSubSets = subset(copy);
                result.addAll(subSubSets);
                cache.add(copy);
            }
        }
        result.add(subset);
        return result;
    }

}


/**2 With Sets */

/*

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> inputList = new ArrayList<>();
        for (int num : nums) {
            inputList.add(num);
        }
        List<List<Integer>> result = new ArrayList<>(subset(inputList));
        result.add(0, new ArrayList<>());
        return result;
    }

    private Set<List<Integer>> subset(List<Integer> subset) {
        Set<List<Integer>> result = new HashSet<>();
        if (subset.size() == 1) {
            result.add(subset);
            return result;
        }
        for (int i = 0; i < subset.size(); i++) {
            List<Integer> copy = new ArrayList<>(subset);
            copy.remove(i);
            Set<List<Integer>> subSubSets = subset(copy);
            result.addAll(subSubSets);
        }
        result.add(subset);
        return result;
    }

 */

/**1 */

/*

  public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<Integer> inputList = new ArrayList<>();
        for (int num : nums) {
            inputList.add(num);
        }
        Set<Integer> visited = new HashSet<>();
        List<List<Integer>> subset = subset(inputList, visited);
        subset.add(0, new ArrayList<>());
        return subset;
    }

    private List<List<Integer>> subset(List<Integer> subset, Set<Integer> visited) {
        List<List<Integer>> result = new ArrayList<>();
        if (subset.size() == 1) {
            if(!visited.contains(subset.get(0))){
                visited.add(subset.get(0));
                result.add(subset);
            }
            return result;
        }
        for (int i = 0; i < subset.size(); i++) {
            List<Integer> copy = new ArrayList<>(subset);
            copy.remove(i);
            List<List<Integer>> subSubSets = subset(copy, visited);
            result.addAll(subSubSets);
        }
        result.add(subset);
        return result;
    }


 */
