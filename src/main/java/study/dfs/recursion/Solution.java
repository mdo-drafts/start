package study.dfs.recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    List<Integer> result;
    Set<Integer> visited;

    public List<Integer> dfs(int V, List<List<Integer>> adj) {
        result = new ArrayList<>();
        visited = new HashSet<>();

        dfsRec(0, adj);
        return result;
    }

    private void dfsRec(int node, List<List<Integer>> adj) {
        visited.add(node);
        result.add(node);
        for (int neighbor : adj.get(node)) {
            if (!visited.contains(neighbor)) {
                dfsRec(neighbor, adj);
            }
        }
    }
}
