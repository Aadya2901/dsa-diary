import java.util.*;

public class TypeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 25;
        long b = a; // Implicit widening (int to long) is allowed
        System.out.println(b);

        // Not allowed: narrowing conversion without explicit cast
        // long x = 25;
        // int y = (int)x; // This works only with explicit cast
        // System.out.println(y);

        sc.close();
    }
}
