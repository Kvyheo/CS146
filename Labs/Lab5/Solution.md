# Valid Binary Search Tree (BST) Solution High-Approach Explaination

## Problem Statement:
Given the root of a binary tree, determine if it is a valid binary search tree (BST). For simplicity, in this scenario, we define a BST where the left subtree of a node contains only nodes with keys less than the node's key, and the right subtree of a node contains only nodes with keys greater than the node's key. This property applies to all subtrees as well.

## High-Level Approach:

1. **In-Order Traversal:** We use the in-order traversal technique to traverse the binary tree.
2. **Track Previous Node:** While traversing the tree, we keep track of the previously visited node.
3. **BST Property Check:** At each node, we compare its value with the value of the previously visited node to ensure that the current node's value is greater than the previous node's value.
4. **Recursion:** We implement the solution recursively to handle each subtree.
