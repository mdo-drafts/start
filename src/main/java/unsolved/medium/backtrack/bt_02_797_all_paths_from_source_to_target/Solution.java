package unsolved.medium.backtrack.bt_02_797_all_paths_from_source_to_target;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer> current = new ArrayList<>();
        backtrack(graph, 0, current);
        return result;
    }


    private void backtrack(int[][] graph, int currInd, List<Integer> current) {
        if (graph[currInd].length == 0) {
            current.add(currInd);
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < graph[currInd].length; i++) {
            current.add(currInd);
            backtrack(graph, graph[currInd][i], current);
            current.remove(current.size() - 1);
        }
    }
}
