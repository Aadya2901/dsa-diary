public class Get_ith_Bit {
    public static void getIthBit(int n, int i) {
        int bitMask = 1 << i;

        if ((n & bitMask) == 0) {
            System.out.println("Bit at position " + i + " is 0");
        }

        else {
            System.out.println("Bit at position " + i + " is 1");
        }
    }

    public static void main(String[] args) {
        getIthBit(13, 0); // 13 = 1101 → bit 0 = 1
        getIthBit(13, 1); // bit 1 = 0
        getIthBit(13, 2); // bit 2 = 1
        getIthBit(13, 3); // bit 3 = 1
    }
}

/*
 * How it works:
 * You want to check the ith bit (0-based from the right).
 * 
 * bitMask = 1 << i sets only the ith bit to 1.
 * 
 * (n & bitMask) keeps only the ith bit of n.
 * 
 * If the result is not 0, the ith bit is 1; else it's 0.
 * 
 * Function getIthBit(n, i):
 * bitMask = 1 shifted left by i
 * If (n AND bitMask) is not zero:
 * Print "Bit at position i is 1"
 * Else:
 * Print "Bit at position i is 0"
 * 
 * Main:
 * Call getIthBit(13, 0)
 * Call getIthBit(13, 1)
 * Call getIthBit(13, 2)
 * Call getIthBit(13, 3)
 * 
 * Time and Space Complexity
 * ✅ Time Complexity: O(1)
 * Bitwise operations and shift are constant time.
 * 
 * ✅ Space Complexity: O(1)
 * Only one variable (bitMask) used.
 * 
 */