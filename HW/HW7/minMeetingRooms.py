from typing import List
import heapq

class ServerManager:

    def minMeetingRooms(self, intervals: List[List[int]]) -> int:
        if not intervals:
            return 0
          
        intervals.sort(key=lambda x: x[0])

        end_times = []

        heapq.heappush(end_times, intervals[0][1])

        for i in range(1, len(intervals)):
            start_time = intervals[i][0]

            if end_times and start_time >= end_times[0]:
      
                heapq.heappop(end_times)
            heapq.heappush(end_times, intervals[i][1])

        return len(end_times)

# Test cases
server_manager = ServerManager()

intervals1 = [[0, 30], [5, 10], [15, 20]]
print(server_manager.minMeetingRooms(intervals1))  # Output: 2

intervals2 = [[0, 1], [1, 2], [2, 3]]
print(server_manager.minMeetingRooms(intervals2))
