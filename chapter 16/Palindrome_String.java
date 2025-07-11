import java.util.Scanner;

public class Palindrome_String {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Is Palindrome? " + isPalindrome(str));

        sc.close();
    }

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

/*
 * function isPalindrome(str):
 * n = length of str
 * for i from 0 to n/2 - 1:
 * if str[i] ≠ str[n - 1 - i]:
 * return false
 * return true
 * 
 * Time Complexity (TC)
 * Best Case: O(1)
 * → If the first pair of characters mismatch, it returns immediately.
 * 
 * Worst Case: O(n)
 * → If the string is a palindrome (or mismatch is at the end), it compares up
 * to n/2 characters.
 * 
 * Space Complexity: O(1)
 * → No extra space is used (ignoring input string).
 */