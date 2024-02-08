def first_bad_version(n):
        left, right = 1, n

        while left < right:
            mid = left + (right - left) // 2
            if VersionControl.isBadVersion(mid):
                right = mid
            else:
                left = mid + 1

        return left

n = 10  # Assuming there are 10 versions
print("The first bad version is:", 
