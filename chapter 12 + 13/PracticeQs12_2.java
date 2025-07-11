public class PracticeQs12_2 {
    public static void sumOfSecondRow(int nums[][]) {
        int sum = 0;

        for (int i = 0; i < nums[0].length; i++) {
            sum += nums[1][i];
        }

        System.out.println("Sum is: " + sum);

    }

    public static void main(String[] args) {
        int[][] nums = {
                { 1, 4, 9 },
                { 11, 4, 3 },
                { 2, 2, 3 }
        };

        sumOfSecondRow(nums);
    }
}

/*
 * FUNCTION sumOfSecondRow(matrix)
 * sum ← 0
 * FOR i FROM 0 TO number_of_columns - 1
 * sum ← sum + matrix[1][i]
 * END FOR
 * PRINT "Sum is:", sum
 * END FUNCTION
 * 
 * Time Complexity (TC)
 * Let:
 * 
 * n = number of columns
 * 
 * Metric Value
 * Time Complexity O(n)
 * Space Complexity O(1)
 */