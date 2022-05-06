package solved.medium.graph.g_02_207_course_schedule;

import java.util.*;

public class Solution {

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        Map<Integer, List<Integer>> preMap = new HashMap<>();
        Set<Integer> visited = new HashSet<>();

        for (int i = 0; i < numCourses; i++) {
            preMap.put(i, new ArrayList<>());
        }

        for (int[] prerequisite : prerequisites) {
            preMap.get(prerequisite[0]).add(prerequisite[1]);
        }

        for (int i = 0; i < numCourses; i++) {
            boolean res = dfs(preMap, visited, i);
            if (!res) {
                return false;
            }
        }
        return true;
    }


    private boolean dfs(Map<Integer, List<Integer>> preMap, Set<Integer> visited, int course) {
        if (preMap.get(course).isEmpty()) {
            return true;
        }
        if (visited.contains(course)) {
            return false;
        }

        visited.add(course);
        for (int prerequisiteCourse : preMap.get(course)) {
            boolean res = dfs(preMap, visited, prerequisiteCourse);
            if (!res) {
                return false;
            }
        }
        visited.remove(course);
        preMap.put(course, Collections.EMPTY_LIST);
        return true;
    }
}
