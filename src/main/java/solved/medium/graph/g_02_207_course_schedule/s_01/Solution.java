package solved.medium.graph.g_02_207_course_schedule.s_01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        int[] incoming = new int[numCourses];

        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] pair : prerequisites) {
            incoming[pair[0]]++;
            adjList.get(pair[1]).add(pair[0]);
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < incoming.length; i++) {
            if (incoming[i] == 0) {
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) {
            int currNode = queue.poll();
            for (int neighbor : adjList.get(currNode)) {
                incoming[neighbor]--;
                if (incoming[neighbor] == 0) {
                    queue.add(neighbor);
                }
            }
        }

        int count = 0;
        for(int item : incoming){
            if(item == 0){
                count++;
            }
        }
        return numCourses == count;
    }
}
