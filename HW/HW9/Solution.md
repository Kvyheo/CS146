# Solution Explaination for Finding Lowest Common Ancestor in a Binary Search Tree

The problem requires finding the lowest common ancestor (LCA) node of two given nodes in a binary search tree (BST). The LCA is defined as the lowest node in the tree that has both given nodes as descendants.

## Algorithm:

1. **Start from the Root Node:**
   - Begin traversal from the root node of the BST.

2. **Comparison of Node Values:**
   - At each step of traversal, compare the values of the current node, p, and q.

3. **Traversal Direction:**
   - If both p and q are less than the current node's value, move to the left child.
   - If both p and q are greater than the current node's value, move to the right child.

4. **Finding the LCA:**
   - Continue traversing until finding a node where one value is on the left side and the other value is on the right side of the current node.
   - Alternatively, if one of the values matches the current node's value, return the current node itself as the LCA.

5. **Iterative Process:**
   - This approach is iterative, allowing us to traverse the BST efficiently without using recursion.

## Explanation:

- The key property of a BST is that for any node, the left subtree contains nodes with values less than the current node, and the right subtree contains nodes with values greater than the current node.
- By utilizing this property, we can iteratively traverse the BST while comparing the values of the given nodes, p and q, with the values of the current node.
- Based on the comparison, we navigate left or right in the tree until finding the LCA.
- This approach ensures an efficient solution with a time complexity of O(log N) on average, where N is the number of nodes in the tree.
