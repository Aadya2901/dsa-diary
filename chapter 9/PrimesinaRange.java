import java.util.Scanner;

public class PrimesinaRange {

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Method to print all prime numbers in the range [2, n]
    public static void PrimeinRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper limit: ");
        int n = sc.nextInt();

        PrimeinRange(n); // Call the function

        sc.close();
    }
}