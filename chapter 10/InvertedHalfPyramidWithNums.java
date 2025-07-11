import java.util.Scanner;

public class InvertedHalfPyramidWithNums {
    public static void invertedHalfPyramidWithNums(int totRows) {
        for (int i = 1; i <= totRows; i++) {
            for (int j = 1; j <= totRows - i + 1; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int totRows = sc.nextInt();

        invertedHalfPyramidWithNums(totRows);

        sc.close();
    }
}
