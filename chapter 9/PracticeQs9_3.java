import java.util.Scanner;

public class PracticeQs9_3 {
    public static void palindrome(int num) {

        int originalNum = num;
        int rev = 0; 

            while (num > 0)  {
            int lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num = num / 10;
        }

        if (originalNum == rev) {
            System.out.println("The number " + originalNum + " is a palindrome");
        }

        else {
            System.out.println("The number " + originalNum + " is not a palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        palindrome(num);

        sc.close();
    }
}
