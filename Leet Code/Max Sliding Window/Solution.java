import java.util.Arrays;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        for(int i = 0; i <= nums.length - k; i++){
            result[i] = Arrays.stream(Arrays.copyOfRange(nums, i, i+k)).max().getAsInt();
        }
        return result;
    }
}