# Three-Sum Problem Solution

## Problem Statement

Given an integer array `nums`, the task is to find all unique triplets `[nums[i], nums[j], nums[k]]` such that `i != j`, `i != k`, and `j != k`, and `nums[i] + nums[j] + nums[k] == 0`.

### Constraints

- The solution set must not contain duplicate triplets.
- The order of the output and the order of the triplets do not matter.
- `3 <= nums.length <= 3000`
- `-10^5 <= nums[i] <= 10^5`

### High-Level Approach

1. **Sort the Array:**
   - Sort the given array in ascending order.

2. **Fix one Element and Use Two Pointers:**
   - Iterate through the array.
   - Element `nums[i]`, consider it as the first element of a potential triplet.
   - Use two pointers (`left` and `right`) to find the remaining two elements whose sum equals `-nums[i]`.

3. **Handle Duplicates:**
   - To avoid duplicate triplets, skip identical elements while iterating through the array.

4. **Update Pointers:**
   - Move the pointers based on the comparison of the sum with zero.
     - If the sum is less than zero, move the `left` pointer to the right.
     - If the sum is greater than zero, move the `right` pointer to the left.
     - If the sum is zero, we found a triplet; add it to the result.

5. **Return Result:**
   - Collect all unique triplets in a list and return the result.
