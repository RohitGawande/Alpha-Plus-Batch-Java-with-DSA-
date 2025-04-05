public class Solution {
    public int maxProfit(int[] prices) {
        // Initialize variables to track the minimum price and maximum profit
        int minPrice = Integer.MAX_VALUE;  // To store the minimum price so far
        int maxProfit = 0;  // To store the maximum profit

        // Iterate through the prices array
        for (int price : prices) {
            // Update minPrice if we find a new lower price
            if (price < minPrice) {
                minPrice = price;
            } 
            // Calculate profit if we sell at the current price
            else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }

        // Return the maximum profit
        return maxProfit;
    }

    public static void main(String[] args) {
        // Create an instance of the Solution class
        Solution solution = new Solution();
        
        // Test case 1
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit for prices1: " + solution.maxProfit(prices1)); // Expected output: 5
        
        // Test case 2
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Max Profit for prices2: " + solution.maxProfit(prices2)); // Expected output: 0
    }
}
