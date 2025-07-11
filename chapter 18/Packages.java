import java.util.Scanner;

public class Packages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        System.out.println(a);

        sc.close();
    }
}

/*
 * Packages in Java – Complete Explanation
 * 🔹 What is a Package in Java?
 * A package in Java is a namespace that organizes classes and interfaces.
 * It is used to group related classes, avoid name conflicts, and provide better
 * modularity and access control.
 * 
 * 🔹 Types of Packages in Java:
 * Type Description Example
 * Built-in Provided by Java API java.util, java.io
 * User-defined Created by the programmer package mypackage;
 * 
 * ✅ 1. Built-in Package Example
 * java
 * Copy
 * Edit
 * import java.util.Scanner;
 * 
 * public class BuiltInPackageExample {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.print("Enter your name: ");
 * String name = sc.nextLine();
 * System.out.println("Hello, " + name);
 * }
 * }
 * java.util is a built-in package
 * 
 * Scanner is a class in that package
 * 
 * ✅ 2. User-defined Package Example
 * ✅ Step 1: Create a package
 * File: Calculator.java
 * 
 * java
 * Copy
 * Edit
 * package mypackage;
 * 
 * public class Calculator {
 * public int add(int a, int b) {
 * return a + b;
 * }
 * }
 * ✅ Step 2: Use the package
 * File: Main.java
 * 
 * java
 * Copy
 * Edit
 * import mypackage.Calculator;
 * 
 * public class Main {
 * public static void main(String[] args) {
 * Calculator calc = new Calculator();
 * System.out.println("Sum: " + calc.add(10, 20));
 * }
 * }
 * 🔧 How to Compile and Run:
 * Folder Structure:
 * 
 * css
 * Copy
 * Edit
 * project/
 * │
 * ├── mypackage/
 * │ └── Calculator.java
 * └── Main.java
 * Compile:
 * 
 * bash
 * Copy
 * Edit
 * javac mypackage/Calculator.java
 * javac -cp . Main.java
 * Run:
 * 
 * bash
 * Copy
 * Edit
 * java Main
 * 📦 Why Use Packages?
 * Benefit Description
 * ✔️ Avoids name conflicts You can have two classes with the same name in
 * different packages.
 * ✔️ Organizes code Related classes stay grouped.
 * ✔️ Access protection Helps control visibility using public, protected, etc.
 * ✔️ Reusability Classes in packages can be easily reused.
 * 
 * 🔐 Access Modifiers with Packages:
 * Modifier Same Class Same Package Subclass (other package) Other Class
 * public ✅ ✅ ✅ ✅
 * protected ✅ ✅ ✅ ❌
 * (default) ✅ ✅ ❌ ❌
 * private ✅ ❌ ❌ ❌
 * 
 * ✅ Summary:
 * Keyword Use
 * package Declares a class belongs to a package
 * import Imports another package's class
 * javac -d . Compiles and places class in correct folde
 */