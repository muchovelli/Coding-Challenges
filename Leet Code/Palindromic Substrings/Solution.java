class Solution {
    public int countSubstrings(String s) {
        int result = 0;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < s.length() - i + 1; j++) {
                if (isPalindromic(s.substring(j, j + i))) {
                    result++;
                }
            }
        }

        return result;
    }

    private boolean isPalindromic(String s) {
        for (int i = 0; i <= s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}