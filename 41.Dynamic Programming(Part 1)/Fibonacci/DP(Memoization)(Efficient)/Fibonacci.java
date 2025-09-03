public class Fibonacci {
    // Function to calculate Fibonacci number using memoization
    public static int fib(int n, int[] f) {
        // Base case: if n is 0 or 1, return n (first two Fibonacci numbers)
        if (n == 1 || n == 0) {
            return n;
        }
        // Check if fib(n) is already calculated and stored in the array
        if (f[n] != 0) { // If f[n] is not 0, it means fib(n) is already computed
            return f[n];
        }
        // Compute fib(n) recursively and store the result in the array
        f[n] = fib(n - 1, f) + fib(n - 2, f);
        return f[n]; // Return the stored value
    }
    
    public static void main(String[] args) {
        int n = 6; // Calculate the 6th Fibonacci number
        int[] f = new int[n + 1]; // Create an array to store Fibonacci values, size n+1
        System.out.println("Fibonacci of " + n + " is: " + fib(n, f));
        // Display the stored array values after computation
        System.out.println("Memoization Array: ");
        for (int i = 0; i <= n; i++) {
            System.out.println("f[" + i + "] = " + f[i]);
        }
    }
}