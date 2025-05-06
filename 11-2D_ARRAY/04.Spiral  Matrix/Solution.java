public class Solution {

    // Function to print matrix in spiral form
    public static void spiralMatrix(int matrix[][]) {
        int startRow = 0;
        int endRow = matrix.length - 1;          // Last row index
        int startCol = 0;
        int endCol = matrix[0].length - 1;       // Last column index

        // Keep looping until the whole matrix is traversed
        while (startRow <= endRow && startCol <= endCol) {

            // 🔹 1. Traverse Top Row → from left to right
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // 🔹 2. Traverse Right Column ↓ from top to bottom
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // 🔹 3. Traverse Bottom Row ← from right to left
            if (startRow < endRow) { // to avoid double printing
                for (int j = endCol - 1; j >= startCol; j--) {
                    System.out.print(matrix[endRow][j] + " ");
                }
            }

            // 🔹 4. Traverse Left Column ↑ from bottom to top
            if (startCol < endCol) { // to avoid double printing
                for (int i = endRow - 1; i > startRow; i--) {
                    System.out.print(matrix[i][startCol] + " ");
                }
            }

            // Move the boundaries inward to the next inner layer
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }

    // Main method
    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        // Print matrix in spiral order
        spiralMatrix(matrix);
    }
}
