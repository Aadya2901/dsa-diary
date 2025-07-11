import java.util.*;

public class ReverseANumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = sc.nextInt();

        for (int i = n; i > 0; i /= 10) {
            int lastDigit = i % 10;
            System.out.print(lastDigit);
        }

        System.out.println();

        sc.close();
    }
}
