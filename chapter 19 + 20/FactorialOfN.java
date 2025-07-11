public class FactorialOfN {
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }

        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        int result = fact(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
}

/*
 * FUNCTION fact(n):
 * IF n == 0:
 * RETURN 1
 * RETURN n * fact(n - 1)
 * 
 * Time Complexity (TC):
 * O(n)
 */