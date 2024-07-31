import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = 3;
        int columns = 4;
        int[][] matrix = new int[rows][columns];
        int[][] transpose = new int[columns][rows];

        // Getting the matrix data from the user
        System.out.println("Enter the elements of the 3x4 matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("Element at [%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Calculating the transpose of the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Printing the original matrix
        System.out.println("Original Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Printing the transpose of the matrix
        System.out.println("Transpose of the Matrix:");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

        // Closing the scanner
        scanner.close();
    }
}
