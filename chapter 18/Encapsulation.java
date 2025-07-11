public class Encapsulation {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.setUsername("aadyapatel");
        myAcc.setPassword("abcd@123");

        // Accessing through getter
        System.out.println("Username: " + myAcc.getUsername());
        // System.out.println("Password: " + myAcc.password); // ❌ Not allowed: password
        // is private
    }
}

class BankAccount {
    // 🔒 Data is private (encapsulated)
    private String username;
    private String password;

    // ✅ Public getter and setter methods
    public void setUsername(String uname) {
        username = uname;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String pwd) {
        // Optional: Add password validation here
        password = pwd;
    }

    public boolean checkPassword(String inputPwd) {
        return password.equals(inputPwd);
    }
}

/*
 * Great! Let's understand **encapsulation** in Java — especially in context of
 * your `BankAccount` example.
 * 
 * ---
 * 
 * ## ✅ **Encapsulation in Java**
 * 
 * ### 🔹 Definition:
 ** 
 * Encapsulation** is the object-oriented programming principle of **binding
 * data (variables) and the methods that operate on them into a single unit
 * (class)** and **restricting direct access to some of the object's
 * components**.
 * 
 * In simple terms:
 * 
 * >
 * **"Hide the internal details of how an object works, and expose only what is necessary through public methods."
 * **
 * 
 * ---
 * 
 * ### 🔐 **Why Use Encapsulation?**
 * 
 * To **protect data** from unauthorized access.
 * To **control how data is modified**.
 * To make code **more modular, readable, and maintainable**.
 * 
 * ---
 * 
 * ### 🔍 **Key Encapsulation Features in This Code**
 * 
 * | Feature | Code Reference |
 * | ---------------------------- | --------------------------------- |
 * | Private data members | `private String username;` |
 * | Public getter/setter methods | `getUsername()`, `setPassword()` |
 * | Data hiding | Can't access `password` directly |
 * | Controlled access | Only via setters or custom checks |
 * 
 * ---
 * 
 * ### ✅ **Benefits of Encapsulation:**
 * 
 * Prevents external classes from directly changing important data.
 * Allows validation logic inside setters.
 * Reduces unintended side effects.
 * Enhances **data security and integrity**.
 * 
 * ---
 * 
 * Let me know if you want to add **validation**, or see **real-life examples**
 * of encapsulation (like in ATM systems, login systems, etc.)!
 */