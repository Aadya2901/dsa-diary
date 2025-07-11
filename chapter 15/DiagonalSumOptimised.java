public class DiagonalSumOptimised {
    public static int diagonalSum(int matrix[][]) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            // Primary diagonal: i == j
            sum += matrix[i][i];

            // Secondary diagonal: i + j == n - 1 ⇒ j = n - 1 - i
            if (i != matrix.length - 1 - i) { // avoid double-counting center in odd-sized matrix
                sum += matrix[i][matrix.length - 1 - i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        int result = diagonalSum(matrix); // store returned value
        System.out.println("Sum of diagonals = " + result); // print it
    }
}

/*
 * Function DiagonalSum(matrix, n):
 * Initialize sum ← 0
 * 
 * For i from 0 to n - 1:
 * sum ← sum + matrix[i][i] // Primary diagonal
 * If i ≠ (n - 1 - i): // Avoid double counting center
 * sum ← sum + matrix[i][n - 1 - i] // Secondary diagonal
 * 
 * Return sum
 * 
 * Main:
 * Define 2D array matrix[4][4] with elements
 * Call DiagonalSum(matrix, 4) and store in result
 * Print result
 * 
    The loop runs exactly n times.

In each iteration:

At most 2 operations (primary and secondary diagonal).

✅ Time Complexity = O(n)
 */