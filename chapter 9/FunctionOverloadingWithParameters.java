public class FunctionOverloadingWithParameters {

    // func to calculate sum of two integers
    public static int sum(int a, int b) {
        return a + b;
    }

    // func to calculagte sum of three integers
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 2 and 3: " + sum(2, 3)); // Calls Method 1
        System.out.println("Sum of 2, 3, and 4: " + sum(2, 3, 4)); // Calls Method 2
    }
}
