import java.util.*;

public class PracticeQs7_2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do {
            System.out.print("Enter a number: ");
            number = sc.nextInt();

            if (number % 2 == 0) {
                evenSum += number;
            }

            else {
                oddSum += number;
            }

            System.out.println("Do you want to continue? Press 1 for yes or 0 for no");
            choice = sc.nextInt();
        }

        while (choice == 1);

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);

        sc.close();

    }
}