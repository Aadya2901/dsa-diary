import java.util.Scanner;

public class PracticeQs9_5 {
    public static int sum(int num) {
        int sum = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            sum += lastDigit;
            num = num / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int result = sum(num);

        System.out.println("The sum of the digits in the number is: " + result);

        sc.close();
    }
}
