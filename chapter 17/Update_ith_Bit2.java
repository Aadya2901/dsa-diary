public class Update_ith_Bit2 {
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        n = clearIthBit(n, i);
        int bitMask = newBit << i;

        return n | bitMask;
    }

    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2, 1)); // 14
        System.out.println(updateIthBit(10, 1, 0)); // Output: 8
    }
}

/*
 * Example: updateIthBit(10, 2, 1)
 * 
 * n = 10 → 00001010
 * 
 * Clear bit 2 → 00001010 & ~(00000100) = 00001010 & 11111011 = 00001000 → 8
 * 
 * newBit << i = 1 << 2 = 00000100
 * 
 * OR: 00001000 | 00000100 = 00001100 → 12
 * 
 * Oops! That contradicts earlier output... wait:
 * 
 * Ah — the original binary of 10 = 00001010, bit at index 2 is already 0-based
 * index.
 * 
 * So in Java:
 * 
 * Index i = 2 refers to the third bit from the right (LSB = 0)
 * 
 * Setting the 2nd bit (i = 2) from 0 to 1 gives:
 * 
 * 00001010 (10)
 * 
 * Set bit 2 → becomes 00001110 = 14
 * 
 * ✔️ Output is correct.
 */