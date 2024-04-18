import heapq
from typing import List, Dict

def findTheCity(n: int, edges: List[List[int]], distanceThreshold: int) -> int:
    graph = {i: [] for i in range(n)}
    for u, v, w in edges:
        graph[u].append((v, w))
        graph[v].append((u, w))
    
    def dijkstra(source: int) -> List[int]:
        heap = [(0, source)]
        distances = [float('inf')] * n
        distances[source] = 0
        
        while heap:
            current_distance, u = heapq.heappop(heap)
            
            if current_distance > distances[u]:
                continue
            
            for v, weight in graph[u]:
                distance = current_distance + weight
                if distance < distances[v]:
                    distances[v] = distance
                    heapq.heappush(heap, (distance, v))
        
        return distances
    
    min_reachable_cities = float('inf')
    best_city = 0
    
    # Run Dijkstra from each city and count reachable cities
    for i in range(n):
        distances = dijkstra(i)
        reachable_cities = sum(1 for j in range(n) if distances[j] <= distanceThreshold and i != j)
        
        if reachable_cities < min_reachable_cities or (reachable_cities == min_reachable_cities and i > best_city):
            min_reachable_cities = reachable_cities
            best_city = i
    
    return best_city
