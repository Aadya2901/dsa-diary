import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void halfPyramid(int totRows) {
        for (int i = 1; i <= totRows; i++) {
            // Print spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = totRows; j >= i; j--) {
                System.out.print("*");
            }

            System.out.println(); // Move to next line
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int totRows = sc.nextInt();

        halfPyramid(totRows);

        sc.close();
    }
}
