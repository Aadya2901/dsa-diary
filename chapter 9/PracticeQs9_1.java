import java.util.Scanner;

public class PracticeQs9_1 {
    public static void average(int a, int b, int c) {
        double avg = (a + b + c) / 3;

        System.out.println("The average of three numbers is: " + avg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = sc.nextInt();

        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Enter third number: ");
        int c = sc.nextInt();

        average(a, b, c);

        sc.close();
    }
}
