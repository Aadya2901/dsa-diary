// import java.util.*;

public class UnaryOperators {
    public static void main(String args[]) {

        // increment
        int a = 10;
        int b = a++;  // Post-increment: b = 10, then a = 11
        int c = ++a;  // Pre-increment: a = 12, then c = 12

        // decrement
        int d = a--;  // Post-decrement: d = 12, then a = 11
        int e = --a;  // Pre-decrement: a = 10, then e = 10

        // increment results
        System.out.println("a (final) = " + a); // 10
        System.out.println("b = " + b);         // 10
        System.out.println("c = " + c);         // 12

        // decrement results
        System.out.println("d = " + d);         // 12
        System.out.println("e = " + e);         // 10
    }
}
