import java.util.Scanner;

 class Creation {

    public static void main(String[] args) {
        // Creation of 2D Arrays
        int[][] matrix = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;

        // For input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements for a 3x3 matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt(); // Assign input to each cell
            }
        }

        // For output
        System.out.println("The 3x3 matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " "); // Print each element
            }
            System.out.println(); // New line after each row
        }


    }
}
