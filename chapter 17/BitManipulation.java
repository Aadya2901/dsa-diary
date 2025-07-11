public class BitManipulation {
    public static void main(String[] args) {
        System.out.println(5 & 6); // 4
        System.out.println(5 | 6); // 7
        System.out.println(5 ^ 6); // 3
        System.out.println(~5); // -6
        System.out.println(~0); // -1
        System.out.println(5 << 2); // 20 // a << b = a * b((pow)2)
        System.out.println(6 >> 1); // 3 // a >> b = a / b((pow)2)
    }
}

/*
 * | Operation | Binary Form | Result | Explanation | | |
 * | --------- | -------------------- | -------------- |
 * -------------------------------------------------- | -------------- |
 * ----------------------------- |
 * | `5 & 6` | `0101 & 0110` | `0100` = **4** | AND: Only 1s in both bits stay 1
 * | | |
 * | \`5 | 6\` | \`0101 | 0110\` | `0111` = **7** | OR: At least one 1 makes it
 * 1 |
 * | `5 ^ 6` | `0101 ^ 0110` | `0011` = **3** | XOR: 1 if bits are different | |
 * |
 * | `~5` | `~00000000 00000101` | **-6** | Bitwise NOT: flips all bits; gives
 * 2's complement | | |
 * | `~0` | `~00000000 00000000` | **-1** | All bits flipped = all 1s = -1 (in
 * 2's complement) | | |
 * 
 */
/*
 * | Operator | Symbol | Meaning | Example | |
 * | ----------- | ------ | --------------------------- | -------------------- |
 * ------------ |
 * | AND | `&` | 1 if both bits are 1 | `5 & 3 = 1` | |
 * | OR | \` | \` | 1 if either bit is 1 | `5 \| 3 = 7` |
 * | XOR | `^` | 1 if bits are different | `5 ^ 3 = 6` | |
 * | NOT | `~` | Inverts each bit | `~5 = -6` | |
 * | Left Shift | `<<` | Multiplies by 2 (per shift) | `5 << 1 = 10` | |
 * | Right Shift | `>>` | Divides by 2 (per shift) | `5 >> 1 = 2` | |
 */