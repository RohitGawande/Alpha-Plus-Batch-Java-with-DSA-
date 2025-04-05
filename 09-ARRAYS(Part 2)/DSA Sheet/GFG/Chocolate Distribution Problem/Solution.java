import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // Edge case: If there are fewer packets than students
        if (m > arr.size()) {
            return -1; // Not enough packets for students
        }

        // Sort the array to facilitate grouping
        Collections.sort(arr);

        // Initialize the minimum difference to a large value
        int minDiff = Integer.MAX_VALUE;

        // Iterate through the sorted array
        for (int i = 0; i <= arr.size() - m; i++) {
            // Calculate the difference between the max and min in the current subarray
            int diff = arr.get(i + m - 1) - arr.get(i);
            // Update the minimum difference
            minDiff = Math.min(minDiff, diff);
        }

        return minDiff; // Return the minimum difference
    }
}

// Example usage
class GfG {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 8, 4, 13, 8, 12); // Example test case
        int m = 3;

        Solution ob = new Solution();
        System.out.println(ob.findMinDiff(arr, m)); // Output: 4
    }
}
