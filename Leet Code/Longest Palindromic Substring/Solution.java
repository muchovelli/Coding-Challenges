class Solution {
    public String longestPalindrome(String s) {
        for(int i = 0; i < s.length(); i++) {
            int j = 0;
            while(j <= i) {
                if(isPalindromic(s.substring(j,s.length() - i + j))) {
                    return s.substring(j,s.length() - i + j);
                }
                j++;
            }
        }
        return "";
    }

    private boolean isPalindromic(String s){
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
}