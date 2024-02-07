# Homework 1 - Palindrome Checker
## Problem Statement

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers. Given a string s, return true if it is a palindrome, or false otherwise.

### Java Implementation:
1. This **Remove Non-Alphanumeric Characters and Convert to Lowercase:**
   - Use `replaceAll("[^a-zA-Z0-9]", "")` to remove non-alphanumeric characters using a regular expression.
   - Use `toLowerCase()` to convert the string to lowercase.
2. **Two-Pointer Approach:**
   - Initialize two pointers, `left` at the beginning of the string and `right` at the end.
   - Compare characters at the `left` and `right` pointers.
   - If they are not equal, the string is not a palindrome.
3. **Test the Implementation:**
   - Apply the approach to a sample input.
   - Print the result.

### Python Implementation:
1. **Remove Non-Alphanumeric Characters and Convert to Lowercase:**
   - Use a list comprehension to iterate through characters, keeping only alphanumeric characters in lowercase.
2. **Two-Pointer Approach:**
   - Initialize two pointers, `left` at the beginning of the string and `right` at the end.
   - Compare characters at the `left` and `right` pointers.
   - If they are not equal, the string is not a palindrome.
3. **Test the Implementation:**
   - Apply the approach to a sample input.
   - Print the result.

## Testing

For example, given the input "A man, a plan, a canal: Panama," the expected output is `True` since the modified string is a palindrome.

## Conclusion

The code employs a two-pointer strategy after adjusting the input string to satisfy the palindrome conditions. It effectively manages both uppercase and lowercase characters, along with handling non-alphanumeric characters.
