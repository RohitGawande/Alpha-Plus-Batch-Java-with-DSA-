class Solution {
    public int search(int[] nums, int target) {
        // Initialize the left and right pointers
        int left = 0, right = nums.length - 1;

        // Perform binary search
        while (left <= right) {
            // Calculate the mid-point
            int mid = left + (right - left) / 2;

            // Check if nums[mid] is the target
            if (nums[mid] == target) {
                return mid; // Target found, return the index
            }

            // Determine which half is sorted
            if (nums[left] <= nums[mid]) { // Left half is sorted
                // Check if target lies in the sorted left part
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1; // Narrow down to the left part
                } else {
                    left = mid + 1; // Explore the right part
                }
            } else { // Right half is sorted
                // Check if target lies in the sorted right part
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1; // Narrow down to the right part
                } else {
                    right = mid - 1; // Explore the left part
                }
            }
        }

        // Target not found
        return -1;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        int target1 = 0;
        System.out.println(solution.search(nums1, target1)); // Output: 4

        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        int target2 = 3;
        System.out.println(solution.search(nums2, target2)); // Output: -1

        int[] nums3 = {1};
        int target3 = 0;
        System.out.println(solution.search(nums3, target3)); // Output: -1
    }
}
