# Find the City With the Smallest Number at a Threshold Distance

This solution to the problem of finding the city with the smallest number at a threshold distance using **Dijkstra's**.

## Problem Statement

Given `n` cities numbered from 0 to n-1 and an array `edges` where `edges[i] = [fromi, toi, weighti]` represents a bidirectional and weighted edge between cities `fromi` and `toi`, and a given integer `distanceThreshold`.

The task is to return the city with the smallest number of cities that are reachable through some path and whose distance is at most `distanceThreshold`. If there are multiple such cities, return the city with the greatest number.

### Constraints

- 2 <= n <= 100
- 1 <= edges.length <= n * (n - 1) / 2
- edges[i].length == 3
- 0 <= fromi < toi < n
- 1 <= weighti, distanceThreshold <= 10^4
- All pairs (fromi, toi) are distinct.

## Approach Descriptions

### Dijkstra’s Algorithm

Dijkstra's algorithm is an algorithm for finding the shortest paths between nodes in a graph, which may represent, for example, road networks. It is applied multiple times from each node to find all-pairs shortest paths in this context.

#### Complexity

- **Time Complexity**: O(n * (E log V)), where n is the number of executions (for each node), E is the number of edges, and V is the number of vertices.
- **Space Complexity**: O(n^2), if distances are stored for all node combinations; O(n + E) for the graph representation and priority queue.

