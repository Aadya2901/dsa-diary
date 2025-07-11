public class ModularExponentiation {
    public static int modExp(int a, int n, int m) {
        int ans = 1;
        a = a % m; // Reduce 'a' initially

        while (n > 0) {
            if ((n & 1) != 0) {
                ans = (ans * a) % m;
            }

            a = (a * a) % m;
            n = n >> 1;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(modExp(3, 5, 7)); // Output: 5, since 3^5 = 243 and 243 % 7 = 5
    }
}

/*
 * a = a % m: Reduce the base first

Every multiplication is done modulo m to prevent overflow

Bit manipulation is used (like before) for O(log n) efficiency

Time Complexity:
O(log n)

🔁 Space Complexity:
O(1) (Iterative, constant space)
 */
