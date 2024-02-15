# Homework 4 Analysis

## Problem 1: Insertion Sort Time Complexity

### Best Case: O(n)
- The best case occurs when the array is already sorted. Each element is compared once and there is no need to be moved.

### Average Case: O(n^2)
- During the average case, there will be n/2 comparisons for each element, which is also n/2 swaps.

### Worst Case: O(n^2)
- The worst case occurs when the array is sorted but in a reverse order. Every element will need to compare and shift against every other element.

## Problem 2: Matrix Multiplication Time Complexity

### Best Case: O(rows_A * cols_A * cols_B)
- The best case occurs when matrices A and B are small, and the loop is executed a few times.

### Average Case: O(rows_A * cols_A * cols_B)
- The average case has the same time complexity as same as the best case because there are no specific conditions leading to any variations.

### Worst Case: O(rows_A * cols_A * cols_B)
- The worst case occurs when matrices A and B are large, and the loop is executed for every element in the resulting matrix.
