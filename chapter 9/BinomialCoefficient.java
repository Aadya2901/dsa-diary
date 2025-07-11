import java.util.Scanner;

public class BinomialCoefficient {

    // Method to calculate factorial
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    // Method to calculate Binomial Coefficient (nCr)
    public static int binCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter r: ");
        int r = sc.nextInt();

        if (r > n || n < 0 || r < 0) {
            System.out.println("Invalid input: r must be ≤ n and both must be ≥ 0");
        } else {
            int result = binCoeff(n, r);
            System.out.println("Binomial Coefficient C(" + n + ", " + r + ") = " + result);
        }

        sc.close();
    }

}
