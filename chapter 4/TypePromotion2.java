// import java.util.*;

public class TypePromotion2 {
    public static void main (String args[]) {
        int a = 10;
        float b = 23.45f;
        long c = 29;
        double d = 36;
        double ans = a + b + c + d;
        System.out.println(ans);

        /* 
        int ans = a + b + c + d;
        System.out.println(ans);

        o/p: lossy conversion from double to int.
        */
    }
}