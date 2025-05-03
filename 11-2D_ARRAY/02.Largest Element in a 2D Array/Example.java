import java.util.Scanner;

 class LargestElementFinder {

    public static void largest(int matrix[][]) {
        int max = Integer.MIN_VALUE; // Initialize max with the smallest possible integer
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j]; // Update max if current element is larger
                }
            }
        }
        System.out.println("Largest element found: " + max);
    }

    public static void main(String[] args) {
        // Creation of 2D Arrays
        int[][] matrix = new int[3][3];
        Scanner sc = new Scanner(System.in);

        // For input
        System.out.println("Enter elements for a 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt(); // Assign input to each cell
            }
        }

        // Find largest element
        largest(matrix);
    }
}
