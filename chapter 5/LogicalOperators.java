// import java.util.*;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;

        System.out.println("x = " + x + ", y = " + y);

        // Logical AND
        System.out.println("x && y = " + (x && y));  // false

        // Logical OR
        System.out.println("x || y = " + (x || y));  // true

        // Logical NOT
        System.out.println("!x = " + (!x));          // false
        System.out.println("!y = " + (!y));          // true
    }
}
