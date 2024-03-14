# Binary Tree Inversion Solution Explaination 

## Problem Statement
Given the root of a binary tree, invert the tree, and return its root.

## High-Level Approach
To solve this problem, we can use a simple recursive approach:

### Recursive Approach:
1. **Base Case:** If the current node is null, return null.
2. **Swap Left and Right:** Swap the left and right children of the current node.
3. **Recursive Step:** Recursively call the function on the left and right children.

This approach works by recursively traversing the tree and swapping the left and right children of each node until we reach the leaf nodes.
