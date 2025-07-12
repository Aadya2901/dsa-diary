public class BinaryStringProblem {
    public static void printBinStrings(int n, int lastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // Place "0" always
        printBinStrings(n - 1, 0, str + "0");

        // Place "1" only if lastPlace was 0
        if (lastPlace == 0) {
            printBinStrings(n - 1, 1, str + "1");
        }
    }

    public static void main(String args[]) {
        printBinStrings(3, 0, "");
    }
}

/*
 * function printBinary(n, last, str):
    if n == 0:
        print str
        return
    printBinary(n - 1, 0, str + "0")
    if last == 0:
        printBinary(n - 1, 1, str + "1")

        Time Complexity:
Each call branches into 1 or 2 further calls → roughly O(2ⁿ)

So, Time Complexity = O(2ⁿ) in worst case

Space Complexity = O(n) for recursion stack and string building

 */