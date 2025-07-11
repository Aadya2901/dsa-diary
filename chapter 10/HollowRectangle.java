import java.util.Scanner;

public class HollowRectangle {
    public static void hollowRectangle(int totRows, int totCols) {
        for (int i = 1; i <= totRows; i++) {
            for (int j = 1; j <= totCols; j++) {
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("*");
                }

                else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int totRows = sc.nextInt();

        System.out.println("Enter the number of colums: ");
        int totCols = sc.nextInt();

        hollowRectangle(totRows, totCols);

        sc.close();
    }
}
