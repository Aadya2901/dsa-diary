public class StringCompression {
    public static String stringCompression(String str) {
        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            newStr += str.charAt(i);

            if (count > 1) {
                newStr += count.toString();
            }
        }

        return newStr;
    }

    public static void main(String[] args) {
        String str = "aaabbcccddddeeefffggghhhhiii";

        System.out.println(stringCompression(str));

    }
}

/*
 * 
 * Function stringCompression(str):
 * Initialize newStr as an empty string
 * 
 * For i = 0 to length of str - 1:
 * Set count = 1
 * 
 * While i < length of str - 1 AND str[i] == str[i + 1]:
 * Increment count by 1
 * Increment i by 1
 * 
 * Append str[i] to newStr
 * 
 * If count > 1:
 * Convert count to string and append to newStr
 * 
 * Return newStr
 * 
 * Time & Space Complexity (TC)
 * ✅ Time Complexity: O(n)
 * n = length of the input string.
 * 
 * Each character is visited only once in the for and while loop combined.
 * 
 * i is incremented inside the while loop but does not exceed n - 1.
 * 
 * String concatenation (newStr += ...) takes O(n²) time in worst case due to
 * immutability of String, but logically the algorithm is still O(n) in terms of
 * character scanning.
 * 
 * Space Complexity: O(n)
 * In worst case, the output string (newStr) could be same length as input.
 * 
 * New space is used for newStr and temporary integer count variables.
 */