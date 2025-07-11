public class PrintSumofN {
    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }

        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        int result = sum(n);
        System.out.println("Sum of first " + n + " numbers is: " + result);
    }
}

/*
 * FUNCTION sum(n):
 * IF n == 0:
 * RETURN 0
 * RETURN n + sum(n - 1)
 * 
 * Time Complexity (TC):
 * O(n)
 */