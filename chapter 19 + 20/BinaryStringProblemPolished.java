public class BinaryStringProblemPolished {
    public static void printBinStrings(int n, int lastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // Always allowed to place '0'
        printBinStrings(n - 1, 0, str + "0");

        // Only allowed to place '1' if lastPlace was 0
        if (lastPlace == 0) {
            printBinStrings(n - 1, 1, str + "1"); // ✅ Fixed here
        }
    }

    public static void main(String args[]) {
        printBinStrings(3, 0, "");
    }
}

/*
 * function printBinary(n, last, str):
 * if n == 0:
 * print str
 * return
 * 
 * printBinary(n-1, 0, str + "0")
 * 
 * if last == 0:
 * printBinary(n-1, 1, str + "1")
 * 
 * Time and Space Complexity:
 * Time Complexity: O(2ⁿ) in worst case
 * 
 * Space Complexity: O(n) for recursion stack
 */