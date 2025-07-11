public class Update_ith_Bit {

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        if (newBit == 0) {
            return clearIthBit(n, i);
        } else {
            return setIthBit(n, i);
        }
    }

    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 1, 1)); // Set bit 1 → Output: 10
        System.out.println(updateIthBit(10, 1, 0)); // Clear bit 1 → Output: 8
    }
}

/*
 * n = 10 → 00001010
 * 
 * i = 1
 * | newBit | Operation | Result | Binary |
 * | ------ | -------------- | ------ | ------ |
 * | 1 | Set i-th bit | 10 | 1010 |
 * | 0 | Clear i-th bit | 8 | 1000 |
 * 
 */
