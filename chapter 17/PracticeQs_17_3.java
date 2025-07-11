public class PracticeQs_17_3 {
    public static void main(String[] args) {
        int x = 5;
        int result = -~x;  // Equivalent to x + 1
        System.out.println("x + 1 using -~x: " + result);  // Output: 6
    }
}

/*
 * Trick using Bitwise NOT:
You can use:

java
Copy code
-~x
This is equivalent to x + 1.

🧠 Why?
~x = -x - 1

So -~x = x + 1

✅ Code:
java
Copy code
int x = 5;
System.out.println(-~x);  // Output: 6
 */
