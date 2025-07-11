public class PracticeQs_17_4 {
    public static void main(String[] args) {
        char upper = 'D';

        // Convert to lowercase using bitwise OR with 32 or ' '
        char lower = (char) (upper | 32);
        System.out.println("Lowercase of " + upper + " is " + lower); // Output: d

        // Bonus: Convert lowercase to uppercase using AND with '_'
        char backToUpper = (char) (lower & '_'); // '_' = 95
        System.out.println("Uppercase of " + lower + " is " + backToUpper); // Output: D
    }
}

/*
 * Key Trick:
 * In ASCII:
 * 
 * 'A' = 65 → 01000001
 * 
 * 'a' = 97 → 01100001
 * 
 * Notice:
 * Only difference is the 6th bit (value 32)
 * 
 * To convert uppercase to lowercase:
 * 
 * Set the 6th bit to 1 → OR with 00100000 → 32
 * 
 * ✅ Code:
 * java
 * Copy code
 * char upper = 'B';
 * char lower = (char)(upper | ' '); // or (char)(upper | 32)
 * System.out.println(lower); // Output: b
 * 🔁 For lowercase to uppercase:
 * java
 * Copy code
 * char lower = 'd';
 * char upper = (char)(lower & '_'); // or (char)(lower & 95)
 * System.out.println(upper); // Output: D
 * 
 */