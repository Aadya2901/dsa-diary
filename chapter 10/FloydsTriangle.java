import java.util.Scanner;

public class FloydsTriangle {
    public static void floydsTriangle(int totRows) {
        int counter = 1;

        for (int i = 1; i <= totRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int totRows = sc.nextInt();

        floydsTriangle(totRows);

        sc.close();
    }

}
