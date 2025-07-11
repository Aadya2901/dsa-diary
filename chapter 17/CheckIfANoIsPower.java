public class CheckIfANoIsPower {
    public static boolean ispowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(ispowerOfTwo(8)); // true
        System.out.println(ispowerOfTwo(10)); // false
        System.out.println(ispowerOfTwo(0)); // false
        System.out.println(ispowerOfTwo(1)); // true
    }
}

/*
 * A number n is a power of 2 only if it has exactly one set bit in binary.
 * 
 * For example:
 * 
 * 8 = 1000 → ✅ one set bit
 * 
 * n - 1 = 0111
 * 
 * n & (n - 1) = 1000 & 0111 = 0000
 * 
 * So n & (n - 1) == 0 only when n is a power of 2
 */