import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dimensions of the first matrix
        System.out.println("Enter the number of rows and columns for the first matrix:");
        int rows1 = scanner.nextInt();
        int cols1 = scanner.nextInt();
        
        // Input dimensions of the second matrix
        System.out.println("Enter the number of rows and columns for the second matrix:");
        int rows2 = scanner.nextInt();
        int cols2 = scanner.nextInt();


        System.out.println("Enter elements of the first matrix:");
        int[][] matrix1 = new int[rows1][cols1];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }




        // Input the second matrix
        System.out.println("Enter elements of the second matrix:");
        int[][] matrix2 = new int[rows2][cols2];
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        
        System.out.println("Choose an operation: 1. Addition 2. Subtraction 3. Multiplication");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                if (rows1 == rows2 && cols1 == cols2) {
                    int[][] resultAdd = addMatrices(matrix1, matrix2);
                    System.out.println("Result of addition:");
                    printMatrix(resultAdd);
                } else {
                    System.out.println("Addition is not possible. Matrices must have the same dimensions.");
                }
                break;

            case 2:
                if (rows1 == rows2 && cols1 == cols2) {
                    int[][] resultSub = subtractMatrices(matrix1, matrix2);
                    System.out.println("Result of subtraction:");
                    printMatrix(resultSub);
                } else {
                    System.out.println("Subtraction is not possible. Matrices must have the same dimensions.");
                }
                break;

            case 3:
                if (cols1 == rows2) {
                    int[][] resultMul = multiplyMatrices(matrix1, matrix2);
                    System.out.println("Result of multiplication:");
                    printMatrix(resultMul);
                } else {
                    System.out.println("Multiplication is not possible. Number of columns in the first matrix must equal the number of rows in the second matrix.");
                }
                break;

            default:
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
        }

        scanner.close();
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for(int[] row : matrix){
            for(int element : row){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
