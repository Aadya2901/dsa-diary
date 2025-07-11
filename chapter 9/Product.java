public class Product {
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String args[]) {
        int a = 3;
        int b = 6;
        int product = multiply(a, b);

        System.out.println(product);

        int result = multiply(10, 20);
        System.out.println(result);

    }
}
