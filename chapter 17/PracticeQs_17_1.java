public class PracticeQs_17_1 {
    public static void main(String[] args) {
        int x = 13;
        System.out.println("x ^ x = " + (x ^ x)); // Output: 0
    }
}

/*
 * ^ is the bitwise XOR operator.

XOR of any number with itself is always 0.

🧠 Why?
Let’s say x = 5 → binary: 0101

Then:

yaml
Copy code
x ^ x = 0101 ^ 0101 = 0000 = 0
✅ Answer:
sql
Copy code
x ^ x = 0 for any integer x
 */