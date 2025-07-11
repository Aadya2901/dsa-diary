public class PrintLargestString {
    public static void printLargestString(String fruits[]) {
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }

        System.out.println(largest);
    }

    public static void main(String[] args) {
        String fruits[] = { "apple", "banana", "mango" };

        printLargestString(fruits);
    }
}

// FUNCTION printLargestString(fruits[])
// SET largest = fruits[0]

// FOR i FROM 1 TO length of fruits - 1
// IF largest < fruits[i] (lexicographically)
// SET largest = fruits[i]
// END IF
// END FOR

// PRINT largest
// END FUNCTION

/*
 * Time Complexity (TC)
 * Let:
 * 
 * n = number of strings in the array
 * 
 * m = average length of the strings
 * 
 * 1. Loop runs n-1 times
 * Each comparison uses .compareTo() which compares up to m characters per call.
 * 
 * So overall, it's O(n * m)
 */