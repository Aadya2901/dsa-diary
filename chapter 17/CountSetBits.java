public class CountSetBits {
    public static int countSetbits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }

            n = n >> 1;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSetbits(10));
    }
}

/*
 * n = 10 → binary = 1010
 * 
 * Set bits = 2
 * 
 * ✅ Output:
 * Copy code
 * 2
 */
