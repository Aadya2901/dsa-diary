import java.util.Scanner;

public class SolidRhombus {
    public static void solidRhombus(int totRows) {
        for (int i = 1; i <= totRows; i++) {

            // Print leading spaces
            for (int j = 1; j <= (totRows - i); j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= totRows; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int totRows = sc.nextInt();

        solidRhombus(totRows);

        sc.close();
    }
}