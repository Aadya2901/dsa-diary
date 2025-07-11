import java.util.Scanner;

public class ButterflyPattern {
    public static void butterflyPattern(int totRows) {

        // Top half
        for (int i = 1; i <= totRows; i++) {

            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces
            for (int j = 1; j <= (2 * (totRows - i)); j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println(); // Move to next line
        }

        // Bottom half
        for (int i = totRows; i > 0; i--) {

            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces
            for (int j = 1; j <= (2 * (totRows - i)); j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println(); // Move to next line
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int totRows = sc.nextInt();

        butterflyPattern(totRows);

        sc.close();
    }
}
