public class PracticeQs_14_2 {
    public static void printSum(int nums[][]) {
        int sum = 0;

        for (int i = 0; i < nums[0].length; i++) { // use nums[0].length to loop through columns
            sum += nums[1][i]; // 2nd row = index 1
        }

        System.out.println("The sum of the numbers in the second row of the 'nums' array is " + sum);
    }

    public static void main(String args[]) {
        int[][] nums = {
                { 1, 4, 9 },
                { 11, 4, 3 },
                { 2, 2, 3 }
        };

        printSum(nums);
    }
}

/*
 * public class PracticeQs_14_2 {
    public static void printSum(int nums[][]) {
        int sum = 0;

        for (int i = 0; i < nums[0].length; i++) { // use nums[0].length to loop through columns
            sum += nums[1][i]; // 2nd row = index 1
        }

        System.out.println("The sum of the numbers in the second row of the 'nums' array is " + sum);
    }

    public static void main(String args[]) {
        int[][] nums = {
            { 1, 4, 9 },
            { 11, 4, 3 },
            { 2, 2, 3 }
        };

        printSum(nums);
    }
}

Time Complexity: O(m)
(where m = number of columns in the row)

Space Complexity: O(1)
 */