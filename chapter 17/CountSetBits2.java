public class CountSetBits2 {
    public static int countSetbits(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1); // Removes the rightmost set bit
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSetbits(10)); // Output: 2
    }
}
