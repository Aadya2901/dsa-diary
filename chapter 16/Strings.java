import java.util.Scanner;

public class Strings {
    public static void main(String args[]) {

        // 1. Character array vs String
        char arr[] = { 'a', 'b', 'c', 'd' };
        String str = "abcd";
        String str2 = new String("xyz");

        System.out.println(arr); // Output: abcd
        System.out.println(str); // Output: abcd
        System.out.println(str2); // Output: xyz

        // 2. Taking input from user
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine(); // Reads a full line
        System.out.println(name); // Echoes input

        // 3. String length
        String Name = "Tony Stark";
        System.out.println(Name.length()); // Output: 10

        // 4. String concatenation
        String firstName = "Aadya";
        String lastName = "Patel";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName); // Output: Aadya Patel

        // 5. charAt() demonstration
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " "); // Output: a b c d
        }

        System.out.println();

        sc.close();
    }
}
// Strings are immutable

/*
 * 💡 Key Concepts Illustrated
 * Concept Code Example Output / Note
 * Character array char[] arr = {'a','b','c','d'}; Prints as a string due to
 * System.out.print
 * String literal String str = "abcd"; Immutable, stored in string pool
 * new String() String str2 = new String("xyz"); Creates new object in heap
 * Scanner.nextLine() Reads full line from user input Input prompt
 * length() Name.length() Returns length of the string
 * Concatenation firstName + " " + lastName Combines two strings
 * charAt(i) Access individual characters Used in loop
 * 
 * 🔒 Strings are Immutable
 * When you do:
 * 
 * java
 * Copy
 * Edit
 * String fullName = firstName + lastName;
 * You're not changing firstName or lastName, but creating a new string in
 * memory.
 * 
 * 🧠 PS + TC for charAt loop
 * Pseudocode:
 * pgsql
 * Copy
 * Edit
 * for i from 0 to length of str - 1:
 * print character at index i followed by space
 * Time Complexity:
 * Loop: O(n), where n is str.length()
 * 
 * charAt(i): O(1) for each access
 * 
 * Overall: O(n)
 * 
 * Space: O(1)
 */