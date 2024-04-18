import java.util.*;

public class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }
        for (int[] edge : edges) {
            graph.get(edge[0]).add(new int[]{edge[1], edge[2]});
            graph.get(edge[1]).add(new int[]{edge[0], edge[2]});
        }
        
        int minReachableCities = Integer.MAX_VALUE;
        int bestCity = 0;
        
        for (int i = 0; i < n; i++) {
            int[] distances = dijkstra(i, n, graph);
            int reachableCities = 0;
            for (int dist : distances) {
                if (dist <= distanceThreshold && dist != 0) { 
                    reachableCities++;
                }
            }
            if (reachableCities < minReachableCities || (reachableCities == minReachableCities && i > bestCity)) {
                minReachableCities = reachableCities;
                bestCity = i;
            }
        }
        
        return bestCity;
    }
    
    private int[] dijkstra(int src, int n, Map<Integer, List<int[]>> graph) {
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[]{src, 0});
        
        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int currentNode = current[0];
            int currentDist = current[1];
            
            if (currentDist > dist[currentNode]) {
                continue; 
            }
            
            for (int[] neighbor : graph.get(currentNode)) {
                int nextNode = neighbor[0];
                int weight = neighbor[1];
                int distance = currentDist + weight;
                if (distance < dist[nextNode]) {
                    dist[nextNode] = distance;
                    pq.add(new int[]{nextNode, distance});
                }
            }
        }
        
        return dist;
    }
}
