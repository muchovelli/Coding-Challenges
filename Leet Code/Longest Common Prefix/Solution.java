import java.util.Arrays;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0 ){
             return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        Arrays.sort(strs);
        int end = Math.min(strs[0].length(), strs[strs.length - 1].length());
        int i = 0;
        while(i < end && strs[0].charAt(i) == strs[strs.length - 1].charAt(i)) {
            i++;
        }
        return strs[0].substring(0,i);
    }
}