def isPalindrome(s):
    # Remove non-alphanumeric characters and convert to lowercase
    s = ''.join(char.lower() for char in s if char.isalnum())

    # Check if the string is a palindrome
    left, right = 0, len(s) - 1

    while left < right:
        if s[left] != s[right]:
            return False
        left += 1
        right -= 1

    return True

# Test your function with sample inputs
input_str = "A man, a plan, a canal: Panama"
print(isPalindrome(input_str))
