import java.util.*;

public class PracticeQs1 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int a = sc.nextInt();

        if (a > 0) {
            System.out.println("a is a positive number");
        } else {
            System.out.println("a is a negative number");
        }

        sc.close();
    }
}
