public class Max_Subarray_Sum {
    // Brute Force Approach
    public static void printSubArSum(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE; // Initialize maxSum with the smallest possible value

        // Iterate over all possible subarrays
        for (int i = 0; i < arr.length; i++) { // Start index of subarray
            for (int j = i; j < arr.length; j++) { // End index of subarray
                currSum = 0; // Reset currSum for each new subarray
                for (int k = i; k <= j; k++) { // Traverse the subarray
                    currSum += arr[k]; // Add each element to currSum
                }

                // Print the current subarray sum
                System.out.print("Current Sum: " + currSum + " ");

                // Update maxSum if currSum is greater
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        // Print the results
        System.out.println();
        System.out.println("Max Sum: " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        printSubArSum(arr); // Function call
    }
}