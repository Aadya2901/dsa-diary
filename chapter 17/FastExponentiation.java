public class FastExponentiation {
    public static int fastEx(int a, int n) {
        int ans = 1;

        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }

            a = a * a;
            n = n >> 1;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fastEx(3, 5));
    }
}

/*
 * Instead of multiplying a n times, it uses the binary representation of n:
 * 
 * If the current bit of n is 1 → multiply ans with a
 * 
 * Square a every step (to get a², a⁴, a⁸, etc.)
 * 
 * Right shift n to move to the next bit
 * 
 * 5 in binary = 101
 * 
 * | Step | n (binary) | n (decimal) | (n & 1) | a | ans |
 * | ---- | ---------- | ----------- | ------- | ------- | ------------ |
 * | 1 | 101 | 5 | 1 | 3 | 1 × 3 = 3 |
 * | | | | | 3² = 9 | |
 * | 2 | 010 | 2 | 0 | 9 | 3 |
 * | | | | | 9² = 81 | |
 * | 3 | 001 | 1 | 1 | 81 | 3 × 81 = 243 |
 * 
 */