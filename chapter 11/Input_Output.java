import java.util.Scanner;

public class Input_Output {
    public static void main(String args[]) {
        int marks[] = new int[50];

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Physics marks: ");
        marks[0] = sc.nextInt();

        System.out.print("Enter Chemistry marks: ");
        marks[1] = sc.nextInt();

        System.out.print("Enter Maths marks: ");
        marks[2] = sc.nextInt();

        System.out.print("Enter Computer Science marks: ");
        marks[3] = sc.nextInt();

        System.out.print("Enter English marks: ");
        marks[4] = sc.nextInt();

        // Output marks
        System.out.println("\nMarks entered:");
        System.out.println("Physics: " + marks[0]);
        System.out.println("Chemistry: " + marks[1]);
        System.out.println("Maths: " + marks[2]);
        System.out.println("Computer Science: " + marks[3]);
        System.out.println("English: " + marks[4]);

        // Increment Maths marks by 1
        // marks[2] = marks[2] + 1;
        // System.out.println("Maths (after increment): " + marks[2]);

        // Calculate percentage
        float percentage = (marks[0] + marks[1] + marks[2] + marks[3] + marks[4]) / 5.0f;
        System.out.println("Percentage = " + percentage + "%");

        System.out.println("Lenght of array is: " + marks.length);

        sc.close();
    }
}
