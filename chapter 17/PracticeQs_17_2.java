public class PracticeQs_17_2 {
    public static void main(String[] args) {
        int a = 5, b = 10;

        System.out.println("Before Swap: a = " + a + ", b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
}

/*
 * * U
 * java
 * Copy code
 * 
 * b = a ^ b;
 * a = a ^ b;
 * 
 * 
 * 
 * ✅ Code:
 * java
 * Copy code
 * int a = 5, b = 10;
 * 
 * a = a ^ b;
 * b = a ^ b;
 * a = a ^ b;
 * 
 * // a = 10, b = 5
 */