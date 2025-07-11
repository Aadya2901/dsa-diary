import java.util.Scanner;

public class Factorial {
    public static int factorial(int n) {
        int f = 1;

        for (int i = 1; i <= n; i++) {
            f *= i;
        }

        return f; // factorial of n
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);

        sc.close();
    }
}
