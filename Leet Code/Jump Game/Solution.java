class Solution {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        return canJump(nums, nums.length - 1);
    }

    private boolean canJump(int[] nums, int pos) {
        if (pos == 0) {
            return true;
        }
        for (int i = 0; i < pos; i++) {
            if (nums[i] + i >= pos) {
                return canJump(nums, i);
            }
        }
        return false;
    }
}