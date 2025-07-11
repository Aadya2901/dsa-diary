public class ConvertLettersToUppercase {
    public static String toUppercase(String str) {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }

            else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hi, i am aadya patel kushwaha";

        System.out.println(toUppercase(str));
    }
}

/*
 * FUNCTION toUppercase(str):
 * CREATE empty StringBuilder sb
 * 
 * CONVERT first character of str to uppercase
 * APPEND it to sb
 * 
 * FOR i from 1 to str.length - 1:
 * IF str.charAt(i) == ' ' AND i < str.length - 1:
 * APPEND ' ' to sb
 * INCREMENT i
 * CONVERT str.charAt(i) to uppercase and APPEND to sb
 * ELSE:
 * APPEND str.charAt(i) to sb
 * 
 * RETURN sb as string
 * 
 * 
 * Time Complexity (TC)
 * Let n be the length of the input string.
 * 
 * The loop runs from i = 1 to n - 1 ⇒ O(n)
 * 
 * Inside the loop:
 * 
 * charAt(i) → O(1)
 * 
 * Character.toUpperCase() → O(1)
 * 
 * StringBuilder.append() → O(1) amortized
 * 
 * 🔁 Total Time Complexity: O(n)
 * 
 * ✅ Space Complexity (SC)
 * StringBuilder uses O(n) space
 * 
 * No other data structures
 * 
 * 💾 Space Complexity: O(n)
 * 
 * ✅ Notes / Limitations
 * Your code works well if:
 * 
 * Words are separated by exactly one space
 * 
 * The input string is non-empty
 * 
 * There is no punctuation before words (e.g., ", i" will fail)
 * 
 * ✅ Sample Output of Your Code
 * Input:
 * 
 * java
 * Copy
 * Edit
 * "hi, i am aadya patel kushwaha"
 * Output:
 * 
 * css
 * Copy
 * Edit
 * Hi, I Am Aadya Patel Kushwaha
 * ✅ Works for this case!
 * 
 * ✅ Final Summary
 * Category Value
 * Purpose Capitalize first letter of every word
 * Time Complexity O(n)
 * Space Complexity O(n)
 * Limitation Fails with multiple spaces or punctuation before words
 */