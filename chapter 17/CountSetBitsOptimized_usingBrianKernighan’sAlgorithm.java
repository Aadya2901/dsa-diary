public class CountSetBitsOptimized {
    public static int countSetbits(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);  // removes the rightmost set bit
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSetbits(10)); // Output: 2
        System.out.println(countSetbits(15)); // Output: 4
        System.out.println(countSetbits(0));  // Output: 0
    }
}

/*
 * Each time you do n = n & (n - 1), it removes the rightmost set bit.

So the loop runs only as many times as there are 1s in the binary.

Example: n = 10 → 1010
n = 10 → 1010
n - 1 = 9 → 1001
n & (n-1) = 1000 (removes last set bit)

n = 8 → 1000
n - 1 = 7 → 0111
n & (n-1) = 0000
✅ Total iterations = 2 → 2 set bits

🔁 Time Complexity:
Original method: O(log n) — checks all bits

Brian Kernighan’s: O(set bits) — checks only the 1s
(faster when there are few 1s)


 */