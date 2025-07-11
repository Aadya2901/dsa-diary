public class FunctionOverloadingWithDataTypes {

    // Sum of two integers
    public static int sum(int a, int b) {
        return a + b;
    }

    // Sum of three integers
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Sum of two floats
    public static float sum(float a, float b) {
        return a + b;
    }

    // Sum of two doubles
    public static double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 2 and 3: " + sum(2, 3)); // int, int
        System.out.println("Sum of 2, 3, and 4: " + sum(2, 3, 4)); // int, int, int
        System.out.println("Sum of 2.5 and 3.7: " + sum(2.5, 3.7)); // double, double
        System.out.println("Sum of 2.5f and 3.5f: " + sum(2.5f, 3.5f)); // float, float
    }
}
