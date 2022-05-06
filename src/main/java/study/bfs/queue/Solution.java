package study.bfs.queue;

import java.util.*;

public class Solution {

    public List<Integer> bfs(int V, List<List<Integer>> adj) {

        List<Integer> result = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        queue.add(0);

        while(!queue.isEmpty()){
            int node = queue.poll();
            if(!visited.contains(node)){
               result.add(node);
               visited.add(node);
               for(int neighbor : adj.get(node)){
                   if(!visited.contains(neighbor)){
                       queue.add(neighbor);
                   }
               }
            }
        }
        return result;
    }
}
