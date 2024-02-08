# Lab 2 - Anagram Problem 
## Problem Statement 

Given two strings `s` and `t`, return true if `t` is an anagram of `s`, and false otherwise. An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

### Java Implementation:
1. Convert both strings to character arrays.
2. Sort the character arrays.
3. Compare the sorted arrays.
4. If the sorted arrays are equal, the strings are anagrams.

### Python Implementation:
1. Convert both strings to sorted lists of characters.
2. Compare the sortred lists.
3. If the sorted lists are equal, the strings are anagrams.

## Testing 
Test the functions with sample inputs to verify their correctness.
- For example:
    String s = "listen";
    String t = "silent";

## Conclusion

Both the sorting approach and the frequency counting approach provide efficient ways to determine if two strings are anagrams. The choice between the two approaches may depend on specific constraints or preferences in the use case.
