import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+': 
                System.out.println("Result: " + (a + b));
                break;

            case '-': 
                System.out.println("Result: " + (a - b));
                break;

            case '*': 
                System.out.println("Result: " + (a * b));
                break;

            case '/':
                if (b == 0) {
                    System.out.println("Error: Cannot divide by zero!");
                } else {
                    System.out.println("Result: " + (a / b));
                }
                break;

            case '%':
                if (b == 0) {
                    System.out.println("Error: Cannot perform modulus with zero!");
                } else {
                    System.out.println("Result: " + (a % b));
                }
                break;

            default:
                System.out.println("Invalid operator!");
        }

        sc.close();
    }
}
