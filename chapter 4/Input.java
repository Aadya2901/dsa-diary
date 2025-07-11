import java.util.*;

public class Input {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // only one word
        String input = sc.next();
        System.out.println(input);

        // clear newline before reading full line
        sc.nextLine();

        // full line input
        String input2 = sc.nextLine();
        System.out.println(input2);

        // integer input
        int number = sc.nextInt();
        System.out.println(number);

        // decimal input
        float decimal = sc.nextFloat();
        System.out.println(decimal);

        // close scanner
        sc.close();
    }
}
