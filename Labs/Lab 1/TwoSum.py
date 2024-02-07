def twoSum(nums, target):
    # Using a dictionary to store the difference between target and each element
    num_dict = {}

    for i, num in enumerate(nums):
        complement = target - num

        # Check if the complement exists in the dictionary
        if complement in num_dict:
            return [num_dict[complement], i]

        # If not, add the current element and its index to the dictionary
        num_dict[num] = i

    # No solution found, return an empty list or raise an exception based on requirements
    raise ValueError("No two sum solution")

# Test 
nums = [2, 7, 11, 15]
target = 9
result = twoSum(nums, target)
print(f"Indices: {result[0]}, {result[1]}")
