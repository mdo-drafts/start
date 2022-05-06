package study.dfs.stack;

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
                for (int neighbor : adj.get(node)) {
                    if (!visited.contains(neighbor)) {
                        stack.push(neighbor);
                    }
                }
            }
        }
        return result;
    }
}
