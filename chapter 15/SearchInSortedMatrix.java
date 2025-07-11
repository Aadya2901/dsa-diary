public class SearchInSortedMatrix {
    public static void searchInSortedMatrix(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Key found at cell (" + i + "," + j + ")");
                }
            }
        }
    }

    public static void main(String args[]) {
        int matrix[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };

        searchInSortedMatrix(matrix, 35);
    }

}

/*
 * Function searchInSortedMatrix(matrix, key):
    For each row index i from 0 to number of rows - 1:
        For each column index j from 0 to number of columns - 1:
            If matrix[i][j] == key:
                Print "Key found at cell (i, j)"
                Return
    End For
    Print "Key not found"


    Worst-case: O(n * m) where:
    n = number of rows
    m = number of column
 */
