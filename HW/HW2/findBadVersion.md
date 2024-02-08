# Homework 2 - First Bad Version 
## Problem Statement

You are a product manager leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all versions after a bad version are also bad. Given `n` versions `[1, 2, ..., n]`, you want to find out the first bad version, which causes all the following ones to be bad. You have an API `isBadVersion(version)` which returns whether a version is bad or not. Implement a function to find the first bad version, minimizing the number of calls to the API.

### Java Implementation:
1. Use binary search to find the first bad version.
2. Initiate left and right pointers to the first and last versions.
3. While left < right:
- Calculate mid as (left + right) / 2.\
- If `isBadVersion(mid)` returns true, search in the letf half (set right = mid).
- If `isBadVersion(mid)` returns false, search in the right half (set left = mid + 1).
4. At the end, left and right converge to the first and last version.

### Python Implementation:
Use binary search to find the first bad version.
2. Initiate left and right pointers to the first and last versions.
3. While left < right:
- Calculate mid as (left + right) / 2.\
- If `isBadVersion(mid)` returns true, search in the letf half (set right = mid).
- If `isBadVersion(mid)` returns false, search in the right half (set left = mid + 1).
4. At the end, left and right converge to the first and last version.

## Testing 
1. Test the `firstBadVersion` function with sample input:
2. int n = 10; // Assuming there are 10 versions

## Conclusion

The binary search approach efficiently finds the first bad version by minimizing the number of calls to the `isBadVersion` API. This is achieved by narrowing down the search space in each iteration.
