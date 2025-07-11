import java.util.Scanner;

public class PrintLargestAndSmallestInMatrix {
    public static void printLargestAndSmallestInMatrix(int matrix[][]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        // To track the positions
        int largestRow = -1, largestCol = -1;
        int smallestRow = -1, smallestCol = -1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                    largestRow = i;
                    largestCol = j;
                }

                if (matrix[i][j] < smallest) {
                    smallest = matrix[i][j];
                    smallestRow = i;
                    smallestCol = j;
                }
            }
        }

        System.out.println(
                "The largest element is " + largest + " found at cell (" + largestRow + "," + largestCol + ")");
        System.out.println(
                "The smallest element is " + smallest + " found at cell (" + smallestRow + "," + smallestCol + ")");
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }

        printLargestAndSmallestInMatrix(matrix);

        sc.close();
    }
}

/*
 * function printLargestAndSmallestInMatrix(matrix):
 * largest = -∞
 * smallest = +∞
 * largestRow = -1, largestCol = -1
 * smallestRow = -1, smallestCol = -1
 * 
 * for i from 0 to rows:
 * for j from 0 to cols:
 * if matrix[i][j] > largest:
 * largest = matrix[i][j]
 * largestRow = i
 * largestCol = j
 * 
 * if matrix[i][j] < smallest:
 * smallest = matrix[i][j]
 * smallestRow = i
 * smallestCol = j
 * 
 * print "Largest element is", largest, "at (", largestRow, ",", largestCol, ")"
 * print "Smallest element is", smallest, "at (", smallestRow, ",", smallestCol,
 * ")"
 * 
 * Time & Space Complexity
 * Time Complexity: O(m × n)
 * 
 * Each element is checked once.
 * 
 * Space Complexity: O(1)
 * 
 * No extra space used apart from a few variables.
 */