// do again 

import java.util.Scanner;

public class PracticeQuestion_18_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first complex number
        System.out.println("Enter the real part of first complex number:");
        int real1 = sc.nextInt();
        System.out.println("Enter the imaginary part of first complex number:");
        int imag1 = sc.nextInt();

        Complex c1 = new Complex(real1, imag1);

        // Input second complex number
        System.out.println("Enter the real part of second complex number:");
        int real2 = sc.nextInt();
        System.out.println("Enter the imaginary part of second complex number:");
        int imag2 = sc.nextInt();

        Complex c2 = new Complex(real2, imag2);

        // Perform operations
        Complex sum = c1.add(c2);
        Complex diff = c1.subtract(c2);
        Complex prod = c1.multiply(c2);

        // Display results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + prod);

        sc.close();
    }
}

class Complex {
    int real;
    int imag;

    // Constructor
    Complex(int r, int i) {
        this.real = r;
        this.imag = i;
    }

    // Add two complex numbers
    Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }

    // Subtract two complex numbers
    Complex subtract(Complex c) {
        return new Complex(this.real - c.real, this.imag - c.imag);
    }

    // Multiply two complex numbers: (a + bi)(c + di) = (ac - bd) + (ad + bc)i
    Complex multiply(Complex c) {
        int newReal = this.real * c.real - this.imag * c.imag;
        int newImag = this.real * c.imag + this.imag * c.real;
        return new Complex(newReal, newImag);
    }

    // String representation
    public String toString() {
        if (imag >= 0)
            return real + " + " + imag + "i";
        else
            return real + " - " + (-imag) + "i";
    }
}
