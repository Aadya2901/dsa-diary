public class PracticeQs_14_3 {
    public static void transposedMatrix(int matrix[][]) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Transposed Matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        transposedMatrix(matrix);
    }
}

/*
 * Function transposeMatrix(matrix):
 * Let rows ← number of rows in matrix
 * Let cols ← number of columns in matrix
 * 
 * Create a new matrix transpose of size [cols][rows]
 * 
 * For i from 0 to rows - 1:
 * For j from 0 to cols - 1:
 * transpose[j][i] ← matrix[i][j]
 * 
 * Print transpose matrix
 * 
 * 
 * Time and Space Complexity
 * 
 * Time Complexity: O(n × m)
 * 
 * Space Complexity: O(n × m) (for storing the transpose)
 */