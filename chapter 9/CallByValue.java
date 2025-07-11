public class CallByValue {

    // Swap method
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Inside swap method:");
        System.out.println("a = " + a); // 6
        System.out.println("b = " + b); // 3
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 6;

        // Attempt to swap using a method
        swap(a, b);

        // Check values after method call
        System.out.println("After swap method call:");
        System.out.println("a = " + a); // Still 3
        System.out.println("b = " + b); // Still 6
    }
}
