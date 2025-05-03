import java.util.Scanner;

\ class SmallestElementFinder {

    public static void smallest(int matrix[][]) {
        int min = Integer.MAX_VALUE; // Initialize min with the largest possible integer
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j]; // Update min if current element is smaller
                }
            }
        }
        System.out.println("Smallest element found: " + min);
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

        // Find smallest element
        smallest(matrix);
    }
}
