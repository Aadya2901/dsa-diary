## 🔍 **Understanding Time & Space Complexity**

### ✅ **What is Time & Space Complexity?**

* When analyzing an algorithm, we care about **how much time** and **how much space (memory)** it takes as the **input size grows**.
* We **do not** measure actual time or memory in seconds or bytes. Instead, we focus on how the number of operations or memory units **grows with input size (n)**.

---

## 🧠 **SPACE COMPLEXITY**

### 📘 Definition:

* Space complexity is the **amount of memory** used by an algorithm as a function of the **input size**.
* It includes memory for:

  * Input
  * Variables
  * Data structures (arrays, hash maps, etc.)
  * Function calls / recursion stack

### 📌 Example Analogy:

* Imagine you’re trying to find your pen among your friends.
* Space complexity = **How many rooms you need to search** (memory required to store/track who has what).

---

## 🕒 **TIME COMPLEXITY**

### 📘 Definition:

* Time complexity is the **amount of time** an algorithm takes to complete, as a function of the **input size**.
* It tells us how fast or slow the algorithm is, **not** in real-time units but in terms of how many basic operations it performs.

### ⚠ Types of Time Complexity:

1. **Worst Case** — Maximum time it will ever take (`O(n²)`, `O(n)`, etc.)
2. **Best Case** — Fastest scenario
3. **Average Case** — Expected time over various inputs
4. **Amortized Time** — Average time **per operation** over a series of operations

---

## 📈 **Common Time Complexities with Analogies**

| Complexity   | Real-World Example / Analogy                                                                               |
| ------------ | ---------------------------------------------------------------------------------------------------------- |
| **O(1)**     | You remember exactly who has the pen and go straight to them.                                              |
| **O(log n)** | You divide your friends into halves and ask in which group the pen is. Keep dividing (like binary search). |
| **O(n)**     | You ask each friend one by one: "Do you have my pen?"                                                      |
| **O(n²)**    | For each friend, you ask about every other friend — like checking everyone multiple times. (Nested loops)  |

---

## 📝 **Important Notes**

* Time/Space complexity focuses on **growth rate**, not actual time/memory.
* It helps us compare algorithms and **choose the most efficient** one.
* When solving a problem, always aim to reduce both time and space complexity **when possible**.

---

## ✅ **Summary**

* **Time Complexity** = how fast the algorithm runs (based on input size).
* **Space Complexity** = how much memory it uses.
* Actual performance can depend on hardware/OS, but in theory, we analyze only based on input size.
* Use Big-O notation (`O(n)`, `O(n log n)`, etc.) to describe performance.

