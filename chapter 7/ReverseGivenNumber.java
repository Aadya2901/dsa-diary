import java.util.*;

public class ReverseGivenNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = sc.nextInt();

        int rev = 0;

        for (int i = n; i > 0; i /= 10) {
            int lastDigit = i % 10;
            rev = rev * 10 + lastDigit;
        }

        System.out.print("Reversed number: " + rev);

        sc.close();
    }
}
