public class OddorEven {
    public static void oddOrEven(int n) {
        int bitMask = 1;

        if ((n & bitMask) == 0) {
            System.out.println("It is an even number");
        }

        else {
            System.out.println("It is a odd number");
        }
    }

    public static void main(String[] args) {
        oddOrEven(3); // odd
        oddOrEven(11); // odd
        oddOrEven(14); // even
    }
}

/*
 * You are checking the least significant bit (LSB) of the number:
 * 
 * n & 1 → checks if the last bit is 1 or 0.
 * 
 * If LSB is 0, number is even
 * 
 * If LSB is 1, number is odd
 * 
 * Function oddOrEven(n):
 * Set bitMask = 1
 * If (n AND bitMask) == 0:
 * Print "It is an even number"
 * Else:
 * Print "It is a odd number"
 * 
 * Main Function:
 * Call oddOrEven(3)
 * Call oddOrEven(11)
 * Call oddOrEven(14)
 * 
 * ime and Space Complexity
 * ✅ Time Complexity: O(1)
 * Bitwise AND is a constant-time operation
 * 
 * ✅ Space Complexity: O(1)
 * No extra space used, just a constant-sized variable bitMask
 */