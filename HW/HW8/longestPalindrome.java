public class Solution {
    public int longestPalindrome(String s) {
        int[] charCount = new int[128];
        int palindromeLength = 0;

        for (char c : s.toCharArray()) {
            charCount[c]++;
        }

        for (int count : charCount) {
            palindromeLength += count / 2 * 2;
            if (count % 2 == 1 && palindromeLength % 2 == 0) {
                palindromeLength++;
            }
        }

        return palindromeLength;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome("abccccdd"));
    }
}
