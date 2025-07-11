public class SpiralMatrix {
    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {

            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            // left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }

                System.out.print(matrix[i][startCol] + " ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8, },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        printSpiral(matrix);

    }
}

/*
 * function printSpiral(matrix):
 * startRow = 0
 * startCol = 0
 * endRow = matrix.length - 1
 * endCol = matrix[0].length - 1
 * 
 * while startRow <= endRow and startCol <= endCol:
 * // Traverse Top Row
 * for j = startCol to endCol:
 * print matrix[startRow][j]
 * 
 * // Traverse Right Column
 * for i = startRow + 1 to endRow:
 * print matrix[i][endCol]
 * 
 * // Traverse Bottom Row
 * if startRow != endRow:
 * for j = endCol - 1 to startCol:
 * print matrix[endRow][j]
 * 
 * // Traverse Left Column
 * if startCol != endCol:
 * for i = endRow - 1 to startRow + 1:
 * print matrix[i][startCol]
 * 
 * // Move to inner layer
 * startRow++, startCol++
 * endRow--, endCol--
 * 
 * 
 * Time Complexity: O(m × n)
 * 
 * Where m is number of rows and n is number of columns.
 * 
 * Each element is visited exactly once.
 * 
 * Space Complexity: O(1) (no extra space used except loop variables)
 */