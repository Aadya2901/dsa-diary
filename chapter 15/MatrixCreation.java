import java.util.Scanner;

public class MatrixCreation {
    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Key found at cell (" + i + "," + j + ")");

                    return true;

                }
            }
        }

        System.out.println("Key not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length; // matrix.length = length of matrix, i.e. total no of rows

        int m = matrix[0].length; // matrix[0].length = length

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }

        // Ask for key to search
        System.out.print("Enter the key to search: ");
        int key = sc.nextInt();

        // Call search function
        search(matrix, key);

        sc.close();
    }
}
