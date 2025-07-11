import java.util.*;

public class FunctionwithParameters {
    public static int calculateSum(int a, int b) { // parameters or formal parameters
        int sum = a + b;

        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateSum(a, b); // arguments or actual parameters
        System.out.println(sum);

        sc.close();
    }
}

/*
 * returnType name (type parameter1, type parameter2) {
 * // body
 * return statement;
 * }
 * 
 */