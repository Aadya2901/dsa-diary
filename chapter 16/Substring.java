public class Substring {
    public static String subString(String str, int si, int ei) {
        String substr = "";

        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }

        return substr;
    }

    public static void main(String args[]) {
        String str = "HelloWorld";
        System.out.println(str.substring(0, 5));

        // built in substring function
        str.substring(0, 5);
    }
}

/*
 * FUNCTION subString(str, si, ei)
 * SET substr = ""
 * FOR i FROM si TO ei - 1
 * substr = substr + str[i]
 * END FOR
 * RETURN substr
 * END FUNCTION
 * 
 * Time and Space Complexity
 * Let:
 * 
 * n = ei - si (length of the substring)
 * 
 * ✅ Time Complexity:
 * Each charAt(i) is O(1)
 * 
 * But substr += creates a new string each time → O(n²) in worst case (due to
 * string immutability)
 * 
 * So:
 * 
 * Time Complexity: O(n²) (for custom version)
 * 
 * Built-in substring() is O(1)` because it uses internal memory references.
 * 
 * ✅ Space Complexity:
 * New string of length n → O(n)
 * 
 * 
 */