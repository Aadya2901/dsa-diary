import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        String result = (marks < 33) ? "Fail" : "Pass";

        System.out.println("The result is " + result);

        sc.close();
    }
}
