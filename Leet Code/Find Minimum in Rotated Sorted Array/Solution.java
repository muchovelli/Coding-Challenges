class Solution {
    public int findMin(int[] nums) {
        return findMin(nums, 0, nums.length - 1);
    }

    int findMin(int arr[], int low, int high) {

        if (high < low) {
            return arr[0];
        }
        if (low == high) {
            return arr[low];
        }

        int average = low + (high - low) / 2;

        if (average < high && arr[average + 1] < arr[average]) {
            return arr[average + 1];
        }

        if (average > low && arr[average] < arr[average - 1]) {
            return arr[average];
        }

        if (arr[average] < arr[high]) {
            return findMin(arr, low, average - 1);
        } else {
            return findMin(arr, average + 1, high);
        }
    }
}