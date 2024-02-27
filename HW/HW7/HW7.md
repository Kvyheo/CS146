### Homework7 Solutions

## Problem statement: To estimate the minimum servers for long-running jobs.

# High-Level Approach
The task is to determine the minimum number of servers needed to execute a set of long-running jobs, where each server can handle only one job at a time.

# Algorithm
1. Sort Intervals:
Start by sorting the intervals based on their start times. This ensures that I process jobs in chronological order.
2. Use Priority Queue (Java) or heapq (Python):
Employ a data structure to keep track of the end times of currently running jobs. This helps in identifying available servers and efficiently reassigning them as jobs complete.
In Java, I use a PriorityQueue as a min heap.
In Python, the heapq module provides min heap functionality.
3. Iterate Through Intervals:
Traverse through the sorted intervals.
For each interval:
Check if there is an available server.
If available, reassign the server for the current job by removing the earliest end time.
Assign a new server for the current job by adding its end time to the data structure.
4. Count Servers:
The minimum number of servers required is determined by the size of the data structure (PriorityQueue or heapq) at any point in time.

## Conclusion:

The algorithm ensures that servers are assigned and reassigned optimally as jobs progress, resulting in the minimum number of servers required to handle the given long-running jobs.
