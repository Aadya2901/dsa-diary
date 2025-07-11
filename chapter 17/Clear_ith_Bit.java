public class Clear_ith_Bit {
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);

        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(clearIthBit(10, 1)); // 8
    }
}

// n = 10 → binary: 00001010

// i = 1

// 1 << 1 → 00000010

// ~(1 << 1) → 11111101

// n & bitMask:

// Copy
// Edit
// 00001010
// & 11111101
// 00001000 → 8

// yaml
// Copy
// Edit

// ---

// ### ✅ Output:
// 8