public class Shallow_Deep_Copy {

}

/*
 * So sorry for the delay! Let's now clearly understand **shallow copy** and
 * **deep copy constructors** in Java, using **simple examples**. These are
 * advanced concepts, but I’ll explain in an easy way. 😊
 * 
 * ---
 * 
 * ## 🔁 What is Copying in Java?
 * 
 * When we **copy an object**, we’re duplicating its **data members**.
 * 
 * ✅ If the object contains only **primitive types** (like `int`, `double`),
 * simple copying is fine.
 * ❗But if the object contains **references to other objects or arrays**, we
 * must understand **shallow vs deep copy**.
 * 
 * ---
 * 
 * ## 🔹 1️⃣ Shallow Copy Constructor
 * 
 * ### 🔸 Definition:
 * 
 * A **shallow copy** copies the **reference** to an object, not the object
 * itself. So both original and copied objects **share the same internal
 * object**.
 * 
 * ### 🔸 Example:
 * 
 * ```java
 * public class ShallowCopyExample {
 * public static void main(String[] args) {
 * Address addr = new Address("Mumbai");
 * Student s1 = new Student("Aadya", addr);
 * Student s2 = new Student(s1); // Shallow copy
 * 
 * s2.address.city = "Delhi"; // Changing s2 also changes s1
 * 
 * System.out.println("s1 city: " + s1.address.city); // Delhi
 * System.out.println("s2 city: " + s2.address.city); // Delhi
 * }
 * }
 * 
 * class Address {
 * String city;
 * Address(String city) {
 * this.city = city;
 * }
 * }
 * 
 * class Student {
 * String name;
 * Address address;
 * 
 * Student(String name, Address address) {
 * this.name = name;
 * this.address = address;
 * }
 * 
 * // 🔁 Shallow Copy Constructor
 * Student(Student s) {
 * this.name = s.name;
 * this.address = s.address; // Just copying reference (SHALLOW)
 * }
 * }
 * ```
 * 
 * ---
 * 
 * ### 🧠 Output:
 * 
 * ```
 * s1 city: Delhi
 * s2 city: Delhi
 * ```
 * 
 * Because both objects share the same `address`.
 * 
 * ---
 * 
 * ## 🔹 2️⃣ Deep Copy Constructor
 * 
 * ### 🔸 Definition:
 * 
 * A **deep copy** copies the actual content of the referenced object, not just
 * the reference. So the original and copy are **completely independent**.
 * 
 * ### 🔸 Example:
 * 
 * ```java
 * public class DeepCopyExample {
 * public static void main(String[] args) {
 * Address addr = new Address("Mumbai");
 * Student s1 = new Student("Aadya", addr);
 * Student s2 = new Student(s1); // Deep copy
 * 
 * s2.address.city = "Delhi"; // s1 is unaffected
 * 
 * System.out.println("s1 city: " + s1.address.city); // Mumbai
 * System.out.println("s2 city: " + s2.address.city); // Delhi
 * }
 * }
 * 
 * class Address {
 * String city;
 * Address(String city) {
 * this.city = city;
 * }
 * 
 * // 🔁 Copy Constructor for Address
 * Address(Address a) {
 * this.city = a.city;
 * }
 * }
 * 
 * class Student {
 * String name;
 * Address address;
 * 
 * Student(String name, Address address) {
 * this.name = name;
 * this.address = address;
 * }
 * 
 * // ✅ Deep Copy Constructor
 * Student(Student s) {
 * this.name = s.name;
 * this.address = new Address(s.address); // Creates a new Address object (DEEP)
 * }
 * }
 * ```
 * 
 * ---
 * 
 * ### 🧠 Output:
 * 
 * ```
 * s1 city: Mumbai
 * s2 city: Delhi
 * ```
 * 
 * Now `s1` and `s2` are independent — **that’s deep copy!**
 * 
 * ---
 * 
 * ## ✅ Summary Table
 * 
 * | Feature | Shallow Copy | Deep Copy |
 * | ------------------ | --------------------- | ---------------------------- |
 * | Copies references | ✅ Yes | ❌ No |
 * | Copies actual data | ❌ No | ✅ Yes |
 * | Memory use | Less | More |
 * | Independent? | ❌ No (shared objects) | ✅ Yes (separate objects) |
 * | Use case | Lightweight copy | Secure, complete duplication |
 * 
 * ---
 * 
 * Would you like this in **notes format**, or want a version using **arrays or
 * objects inside objects** (like `Book → Author`, or `Company → Employee`)?
 */