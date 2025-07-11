public class Set_ith_Bit {
    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static void main(String[] args) {
        System.out.println(setIthBit(10, 2));
    }
}

/*
 * The << operator is the left shift operator.
 * 
 * 1 << i means shifting 1 to the left i times, which gives a binary number
 * where only the ith bit is 1.
 * 
 * For example, if i = 2: 1 << 2 → 00000100 (binary) = 4 (decimal)
 * 
 * The | is the bitwise OR operator.
 * 
 * n | bitMask sets the i-th bit of n to 1, regardless of its current value.
 */