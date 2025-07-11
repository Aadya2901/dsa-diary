public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(""); // initializes a StringBuilder
        int sum = 0;

        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch); // appends current character to StringBuilder
            sum += ch; // adds ASCII value of character to sum

        }

        System.out.println(sb); // prints: abcdefghijklmnopqrstuvwxyz
        System.out.println(sb.length()); // prints: 26
        System.out.println(sum); // prints running sum of ASCII values

        System.out.println("StringBuilder content: " + sb); // abcdefghijklmnopqrstuvwxyz
        System.out.println("Length: " + sb.length()); // 26
        System.out.println("Final ASCII Sum: " + sum); // 2847
    }
}

// strings are immutable

/*
 * ### ✅ What is a **StringBuilder** in Java?
 * 
 * `StringBuilder` is a **mutable** sequence of characters. It is used to
 * efficiently manipulate strings (append, insert, delete, reverse, etc.)
 * **without creating new objects every time**, unlike `String`, which is
 * **immutable**.
 * 
 * ---
 * 
 * ### 🔁 **Why use `StringBuilder` instead of `String`?**
 * 
 * `String` is **immutable** → every modification creates a **new object**.
 * `StringBuilder` is **mutable** → it modifies the string **in-place**.
 * `StringBuilder` is **faster** when many string operations are involved,
 * especially in loops.
 * 
 * ---
 * 
 * ### ✅ Basic Syntax:
 * 
 * ```java
 * StringBuilder sb = new StringBuilder("Hello");
 * sb.append(" World");
 * System.out.println(sb); // Output: Hello World
 * ```
 * 
 * ---
 * 
 * ### ✅ Commonly Used Methods:
 * 
 * | Method | Description | Example |
 * | ----------------------- | -------------------------------------- |
 * -------------------------- |
 * | `append(String s)` | Adds string to the end | `sb.append("Java")` |
 * | `insert(int offset, s)` | Inserts at given index | `sb.insert(2, "Java")` |
 * | `replace(i, j, str)` | Replaces i to j-1 with str | `sb.replace(1, 3,
 * "Hi")` |
 * | `delete(i, j)` | Deletes characters from index i to j-1 | `sb.delete(1, 4)`
 * |
 * | `reverse()` | Reverses the string | `sb.reverse()` |
 * | `length()` | Returns length | `sb.length()` |
 * | `charAt(int index)` | Returns char at index | `sb.charAt(0)` |
 * | `setCharAt(i, ch)` | Sets char at index | `sb.setCharAt(1, 'a')` |
 * | `toString()` | Converts `StringBuilder` to `String` | `String s =
 * sb.toString()` |
 * 
 * ---
 * 
 * ### ✅ Example Program:
 * 
 * ```java
 * public class StringBuilderDemo {
 * public static void main(String[] args) {
 * StringBuilder sb = new StringBuilder("Hello");
 * 
 * sb.append(" World"); // Hello World
 * sb.insert(5, ","); // Hello, World
 * sb.replace(7, 12, "Java"); // Hello, Java
 * sb.delete(5, 6); // Hello Java
 * sb.reverse(); // avaJ olleH
 * 
 * System.out.println(sb); // Output: avaJ olleH
 * }
 * }
 * ```
 * 
 * ---
 * 
 * ### ✅ Performance Comparison
 * 
 * | Operation | `String` | `StringBuilder` |
 * | ------------------------- | ------------------------------------ |
 * ----------------------- |
 * | `"s = s + 'a'"` (in loop) | Creates new object every time (Slow) | Appends
 * in-place (Fast) |
 * 
 * So prefer `StringBuilder` in performance-critical string operations, like:
 * 
 * Building long strings
 * Loop-based string concatenation
 * Competitive programming or backend text processing
 * 
 */