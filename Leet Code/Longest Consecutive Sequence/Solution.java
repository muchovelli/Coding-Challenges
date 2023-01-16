class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int max = 1;
        int current = 1;

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length - 1; i++) {
            int next = nums[i] + 1;
            if (nums[i] == nums[i + 1]) {
                continue;
            } else if (next == nums[i + 1]) {
                current++;
            } else {
                max = Math.max(max, current);
                current = 1;
            }
        }
        max = Math.max(max, current);
        return max;
    }
}