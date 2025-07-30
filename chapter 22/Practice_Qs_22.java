public class Practice_Qs_22 {

    /*
     * ### **Question (a):**
     * 
     * ```cpp
     * int i, j, k = 0;
     * for(i = n/2; i <= n; i++) {
     * for(j = 2; j <= n; j = j * 2) {
     * k = k + n/2;
     * }
     * }
     * ```
     * 
     * **Outer loop (i):** runs from `n/2` to `n` ⇒ approx `n/2` times ⇒ **O(n)**
     * **Inner loop (j):** `j = j * 2` ⇒ runs **log₂(n)** times ⇒ **O(log n)**
     * 
     * 🧠 **Total time complexity = O(n \* log n)**
     * 
     * ✅ **Answer: B. O(n log n)**
     * 
     * ---
     * 
     * ### **Question (b):**
     * 
     * ```cpp
     * for(int i = 0; i < n; i += k) // i *= k
     * ```
     * 
     * Correction: Looks like the question intended this:
     * 
     * ```cpp
     * for(int i = 1; i < n; i *= k)
     * ```
     * 
     * \**i *= k** → value of `i` multiplies by `k` every time
     * This runs till `i < n` → Number of iterations ≈ **logₖ(n)**
     * 
     * ✅ **Answer: C. O(logₖ n)**
     * (log base k of n)
     * 
     * ---
     * 
     * ### **Question (c):**
     * 
     * > Algorithm A → O(n),
     * > Algorithm B → O(log n)
     * > So, Algorithm B **always** runs faster than Algorithm A.
     * 
     * 🚫 **This is FALSE.**
     * Because **Big-O** tells us the **worst-case growth rate**, not actual
     * runtime.
     * For small inputs or due to constants, **A could run faster**.
     * 
     * ✅ **Answer: B. False**
     * 
     * ---
     * 
     * ### **Question (d):**
     ** 
     * Code:**
     * 
     * ```java
     * static int floorSqrt(int x) {
     * if (x == 0 || x == 1)
     * return x;
     * int i = 1, result = 1;
     * while (result <= x) {
     * i++;
     * result = i * i;
     * }
     * return i - 1;
     * }
     * ```
     * 
     * 🔍 Let’s analyze:
     * 
     * Loop continues while `i*i <= x`
     * That means it runs approx up to `sqrt(x)` times
     * 
     * 🧠 **Time Complexity = O(√x)**
     * 🧠 **Space Complexity = O(1)** (only a few variables used)
     * 
     * ✅ **Answer: Time = O(√x), Space = O(1)**
     * 
     * ---
     * 
     * ### **Question (e):**
     * 
     * ```cpp
     * int a = 0;
     * for(int i = 0; i < n; ++i) {
     * for(int j = n; j > i; --j) {
     * a = a + i + j;
     * }
     * }
     * ```
     * 
     * Outer loop (i): runs `n` times
     * Inner loop (j): runs from `n` to `i+1` → approximately `n - i` times
     * Total iterations ≈ $\sum_{i=0}^{n-1} (n - i) = \frac{n(n + 1)}{2}$
     * 
     * 🧠 **Time Complexity = O(n²)**
     * 🧠 **Space Complexity = O(1)** (only variable `a` used)
     * 
     * ✅ **Answer: Time = O(n²), Space = O(1)**
     * 
     */

}