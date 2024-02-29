# Longest Palindrome Length

## Problem Statement
Given a string `s` consisting of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

Letters are case-sensitive, and "Aa" is not considered a palindrome.

### Constraints
- 1 <= s.length <= 2000
- s consists of lowercase and/or uppercase English letters only.

## Approach
* I use an array charCount to count the occurrences of each character in the given string.
* Then iterate through the string, incrementing the corresponding count for each character.
* Then iterate through the count array, adding the largest even count for each character to the palindromeLength.
* If there is any character with an odd count, increment the palindromeLength by 1 if it is currently even.
