package solved.medium.graph.g_01_261_graph_valid_tree;

import java.util.*;

public class Solution {

    public boolean validTree(int n, int[][] edges) {

        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] pair : edges) {
            adjList.get(pair[0]).add(pair[1]);
        }

        Set<Integer> visited = new HashSet<>();

        Stack<Integer> stack = new Stack<>();
        stack.add(edges[0][0]);

        while (!stack.empty()) {
            int edge = stack.pop();
            if (visited.contains(edge)) {
                return false;
            }
            visited.add(edge);
            stack.addAll(adjList.get(edge));
        }
        return n == visited.size();
    }
}
