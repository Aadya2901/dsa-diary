import java.util.Scanner;

public class DiamondPattern {
    public static void diamondPattern(int totRows) {

        // Top half
        for (int i = 1; i <= totRows; i++) {

            // Print leading spaces
            for (int j = 1; j <= totRows - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Bottom half
        for (int i = totRows - 1; i > 0; i--) {

            // Print leading spaces
            for (int j = 1; j <= totRows - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int totRows = sc.nextInt();

        diamondPattern(totRows);

        sc.close();
    }
}
