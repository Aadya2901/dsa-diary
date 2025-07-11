import java.util.Arrays;

public class Arrays_Creation {
    public static void main(String args[]) {
        int marks[] = new int[50];

        int numbers[] = { 1, 2, 3 };
        int moreNumbers[] = { 4, 5, 6 };

        String fruits[] = { "strawberry", "guava", "banana" };

        System.out.println(Arrays.toString(marks)); // Prints 50 zeroes
        System.out.println(Arrays.toString(numbers)); // [1, 2, 3]
        System.out.println(Arrays.toString(moreNumbers)); // [4, 5, 6]
        System.out.println(Arrays.toString(fruits)); // [strawberry, guava, banana]
    }
}
