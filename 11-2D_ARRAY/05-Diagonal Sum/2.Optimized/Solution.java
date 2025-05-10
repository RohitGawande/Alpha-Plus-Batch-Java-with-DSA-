public class Solution {

    // Function to calculate sum of both diagonals
    public static int diagonalSum(int matrix[][]) {
        int sum = 0;
        int n = matrix.length; // matrix is square: n x n

        for (int i = 0; i < n; i++) {
            // Primary diagonal element (top-left to bottom-right)
            sum += matrix[i][i];

            // Secondary diagonal element (top-right to bottom-left)
            // Only add if it's NOT the same as primary (middle element in odd-sized matrix)
            if (i != n - 1 - i) {
                sum += matrix[i][n - 1 - i];
            }

            // Dry-run print for learning
            System.out.println("i = " + i + 
                " | Primary: matrix[" + i + "][" + i + "] = " + matrix[i][i] +
                (i != n - 1 - i ? " | Secondary: matrix[" + i + "][" + (n - 1 - i) + "] = " + matrix[i][n - 1 - i] : " | Secondary skipped"));
        }

        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        System.out.println("Diagonal Sum: " + diagonalSum(matrix));
    }
}
