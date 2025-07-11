public class PrintNthFibonacciNumber {
    public static int fibonacciNo(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }
        return fibonacciNo(n - 1) + fibonacciNo(n - 2);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibonacciNo(n));
    }
}
