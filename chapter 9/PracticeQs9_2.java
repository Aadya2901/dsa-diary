import java.util.Scanner;

public class PracticeQs9_2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if (isEven(num)) {
            System.out.println(num + " is even");
        }

        else {
            System.out.println(num + " is odd");
        }

        sc.close();
    }

    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }

        else {
            return false;
        }
    }

    // or

    /*
     * public static boolean isEven2(int num) {
     * return num % 2 == 0;
     * }
     */
}
