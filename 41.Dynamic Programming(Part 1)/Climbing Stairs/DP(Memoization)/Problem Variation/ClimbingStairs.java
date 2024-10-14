import java.util.Arrays;

public class ClimbingStairs {
    public static int countWays(int n, int[] ways) {
        // Base case: if n is 0, there is one way to stay at the ground
        if (n == 0) {
            return 1;
        }
        // If n is negative, there are no ways to reach this step
        if (n < 0) {
            return 0;
        }
        // If we have already calculated the number of ways for this step, return it
        if (ways[n] != -1) { // Already calculated
            return ways[n];
        }
        // Calculate and store the result for future use
        ways[n] = countWays(n - 1, ways) + countWays(n - 2, ways) + countWays(n - 3, ways);
        return ways[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int ways[] = new int[n + 1];
        // Initialize the array with -1 to indicate uncalculated steps
        Arrays.fill(ways, -1);
        // Print the total ways to reach the nth stair
        System.out.println(countWays(n, ways));
    }
}