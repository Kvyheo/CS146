import java.util.*;

public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        int[] visited = new int[numCourses];  

        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] prerequisite : prerequisites) {
            graph.get(prerequisite[1]).add(prerequisite[0]);
        }

        for (int course = 0; course < numCourses; course++) {
            if (!dfs(course, graph, visited)) {
                return false;
            }
        }
        return true;
    }

    private boolean dfs(int course, List<List<Integer>> graph, int[] visited) {
        if (visited[course] == 1) return false;
        if (visited[course] == 2) return true;
        visited[course] = 1;
        for (int nextCourse : graph.get(course)) {
            if (!dfs(nextCourse, graph, visited)) {
                return false;
            }
        }
        visited[course] = 2;
        return true;
    }
}
