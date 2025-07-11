public class ArrayAsFunctionArguments {
    public static void update(int marks[], int nonChangable) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
            nonChangable = 10;
        }
    }

    public static void main(String[] args) {
        int marks[] = { 97, 98, 99 };
        int nonChangable = 5;

        update(marks, nonChangable);

        System.out.println("nonChangable after update: " + nonChangable);

        // Print marks
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
