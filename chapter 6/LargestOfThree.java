import java.util.*;

public class LargestOfThree {
   public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("A is greatest");
        }

        else if (b > c) {
            System.out.println("B is greatest");
        }

        else {
            System.out.println("C is greatest");
        }

        sc.close();
   }
}
