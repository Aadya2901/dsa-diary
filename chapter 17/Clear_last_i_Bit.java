public class Clear_last_i_Bit {
    public static int clearIBits(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(clearIBits(15, 2));
    }
}

/*
 * ~0 gives all 1s:
 * In 32-bit binary → 11111111 11111111 11111111 11111111
 * 
 * (~0) << i shifts the 1s to the left by i, resulting in:
 * 
 * ini
 * Copy code
 * i = 2 → 11111111 11111111 11111111 11111100
 * 
 * This bitmask has the last i bits as 0 and the rest as 1.
 * 
 * java
 * Copy code
 * return n & bitMask;
 * This clears the last i bits of n, leaving the rest unchanged.
 * 
 * 
 * Example:
 * java
 * Copy code
 * clearIBits(15, 2)
 * n = 15 → Binary: 00001111
 * 
 * i = 2 → Clear last 2 bits
 * 
 * Mask:
 * ~0 = 11111111,
 * (~0) << 2 = 11111100
 * 
 * AND operation:
 * 
 * markdown
 * Copy code
 * 00001111 (15)
 * & 11111100
 * ----------
 * 00001100 (12)
 * ✅ Output: 12
 * 
 * ✅ Final Output:
 * Copy code
 * 12
 * 🔄 Reverse Idea (if needed):
 * If you ever want to set the last i bits to 1, you can do:
 * 
 * java
 * Copy code
 * int mask = (1 << i) - 1;
 * n = n | mask;
 */