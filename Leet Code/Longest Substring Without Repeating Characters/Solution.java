class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int result = 0;
        
        for(int i = 0; i < n; i++) {
            boolean[] visited = new boolean[256];
            for(int j = i; j < n; j++) {
                if(visited[s.charAt(j)]) {
                    break;
                } else {
                    result = Math.max(result, j - i + 1);
                    visited[s.charAt(j)] = true;
                }
            }
            visited[s.charAt(i)] = false;
        }
        return result;
    }
}