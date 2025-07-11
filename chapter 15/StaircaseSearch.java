public class StaircaseSearch {
    public static void searchInSortedMatrix(int matrix[][], int key) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Key found at cell (" + row + "," + col + ")");
                return;
            } 
            
            else if (matrix[row][col] > key) {
                col--;
            } 
            
            else {
                row++;
            }
        }

        System.out.println("Key not found");
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };

        searchInSortedMatrix(matrix, 29);
    }
}

/*
 * Function staircaseSearch(matrix, key):
 * row ← 0
 * col ← number of columns - 1
 * 
 * While row < number of rows AND col ≥ 0:
 * If matrix[row][col] == key:
 * Print "Key found at (row, col)"
 * Return
 * 
 * Else if matrix[row][col] > key:
 * col ← col - 1 // Move left
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * Time Complexity: O(n + m)
 * 
 * n = rows, m = columns

    Worst case: start from top-right and go all the way to bottom-left

    Space Complexity: O(1)
 */