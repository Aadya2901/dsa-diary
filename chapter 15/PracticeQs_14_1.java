public class PracticeQs_14_1 {
    public static void printSeven(int matrix[][]) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 7) {
                    count++;
                }
            }
        }

        System.out.println("The number of 7's in the 2d array are:" + count);
    }

    public static void main(String args[]) {
        int matrix[][] = {
                { 4, 7, 8 },
                { 8, 8, 7 }
        };

        printSeven(matrix);
    }
}

/*
 * Function printSeven(matrix):
 * Initialize count ← 0
 * 
 * For i from 0 to number of rows - 1:
 * For j from 0 to number of columns - 1:
 * If matrix[i][j] == 7:
 * count ← count + 1
 * 
 * Print "The number of 7's in the 2D array are: " + count
 * 
 * 
 * Time Complexity: O(n × m)
 * (where n = rows, m = columns)
 */