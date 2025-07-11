import java.util.Scanner;

public class HollowRhombus {
    public static void hollowRhombus(int totRows) {
        for (int i = 1; i <= totRows; i++) {

            // Print leading spaces
            for (int j = 1; j <= totRows - i; j++) {
                System.out.print(" ");
            }

            // Print hollow rectangle
            for (int j = 1; j <= totRows; j++) {
                if (i == 1 || i == totRows || j == 1 || j == totRows) {
                    System.out.print("*");
                }

                else {
                    System.out.print(" ");
                }
            }

            System.out.println(); // Move to next line
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int totRows = sc.nextInt();

        hollowRhombus(totRows);

        sc.close();
    }
}
