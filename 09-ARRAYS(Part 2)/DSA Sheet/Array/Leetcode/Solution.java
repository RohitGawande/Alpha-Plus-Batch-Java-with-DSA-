public class Solution {
    public int maxSubArray(int[] nums) {
        int cs = 0; // Current Subarray Sum
        int max = nums[0]; // Initialize max to the first element of the array

        for (int i = 0; i < nums.length; i++) {
            // Add the current element to the current sum
            cs += nums[i];

            // Update max with the greater of max or current sum
            max = Math.max(max, cs);

            // Reset current sum if it becomes negative
            if (cs < 0) {
                cs = 0;
            }
        }

        return max;
    }
}
