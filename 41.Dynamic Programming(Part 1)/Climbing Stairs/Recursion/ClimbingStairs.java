/**
 * Problem Statement:
 * Given a staircase with 'n' steps, a person can climb either 1 step or 2 steps at a time.
 * The task is to count the total number of ways to reach the nth step.
 * This is a variation of the Fibonacci sequence because each step can be reached from either
 * the previous step (n-1) or the step before that (n-2).
 * 
 * Formula:
 * Ways(n) = Ways(n-1) + Ways(n-2)
 * Base Cases:
 * - If n == 0, there's 1 way (you stay at the start without moving).
 * - If n < 0, there's no way (negative steps are invalid).
 */

 public class ClimbingStairs {
    
    /**
     * Method to count the number of ways to reach the nth step.
     * 
     * n - the number of steps in the staircase
     * return- the number of ways to reach the nth step
     */
    public static int countWays(int n) {
        // Base case: if n is 0, there is 1 way to reach (stay at the ground)
        if (n == 0) {
            return 1;
        }
        // Base case: if n is negative, no valid way exists (0 ways)
        if (n < 0) {
            return 0;
        }
        // Recursive step: sum of ways to reach (n-1) and (n-2) steps
        return countWays(n - 1) + countWays(n - 2);
    }
    
    public static void main(String[] args) {
        // Example: Finding the number of ways to reach the 5th step
        int n = 5;
        System.out.println("Number of ways to reach step " + n + ": " + countWays(n));
    }
}
