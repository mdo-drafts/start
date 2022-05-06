package study.dfs.stack.s_01;

import java.util.*;

public class Solution {

    public List<Integer> dfs(int V, List<List<Integer>> adj) {

        Set<Integer> visited = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();

        stack.push(0);

        while (!stack.isEmpty()) {
            int node = stack.pop();
            if (!visited.contains(node)) {
                result.add(node);
                visited.add(node);
                List<Integer> neighbors = adj.get(node);
                for (int i = neighbors.size() - 1; 0 <= i; i--) {
                    int neighbor = neighbors.get(i);
                    if (!visited.contains(neighbor)) {
                        stack.push(neighbor);
                    }
                }
            }
        }
        return result;
    }
}