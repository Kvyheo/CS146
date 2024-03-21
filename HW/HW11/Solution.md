# Flood Fill Algorithm Solution

## Solution Overview

The solution employs the Depth-First Search (DFS) algorithm. The algorithm starts at a specified pixel and recursively colors all adjacent pixels that have the same original color.

### Depth-First Search (DFS) Approach

The DFS approach treats the image as a graph, with each pixel being a node and connections existing between 4-directionally adjacent pixels. If a neighbor pixel has the same color as the starting pixel, the algorithm recursively applies DFS to it, updating its color to the new specified color.

## Complexity Analysis
Time Complexity: O(N), where N is the number of pixels in the image. The algorithm may visit each pixel once in the worst case.
Space Complexity: O(N), due to the recursion stack. In the worst-case scenario, the entire image needs recoloring, leading to a stack depth equal to the number of pixels.


