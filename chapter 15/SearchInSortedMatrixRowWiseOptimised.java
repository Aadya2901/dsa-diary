public class SearchInSortedMatrixRowWiseOptimised {
    public static void searchInSortedMatrix(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            int low = 0;
            int high = matrix[0].length - 1;

            while (low <= high) {
                int mid = (low + high) / 2;

                if (matrix[i][mid] == key) {
                    System.out.println("Key found at cell (" + i + "," + mid + ")");
                    return;
                }

                else if (matrix[i][mid] < key) {
                    low = mid + 1;
                }

                else {
                    high = mid - 1;
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
 * For each row index i from 0 to number of rows - 1:
 * Set low ← 0
 * Set high ← number of columns - 1
 * 
 * While low ≤ high:
 * Set mid ← (low + high) / 2
 * 
 * If matrix[i][mid] == key:
 * Print "Key found at cell (i, mid)"
 * Return
 * 
 * Else if matrix[i][mid] < key:
 * Set low ← mid + 1
 * 
 * Else:
 * Set high ← mid - 1
 * 
 * End For
 * (If loop completes without finding key)
 * Print "Key not found"
 * 
 * 
 * Time & Space Complexity
 * 
 * Time Complexity: O(n * log m)
 * where n = rows, m = columns
 * 
 * Space Complexity: O(1)
 */