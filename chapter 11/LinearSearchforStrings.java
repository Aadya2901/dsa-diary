public class LinearSearchforStrings {
    public static int linearSearchforStrings(String arr[], String key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String arr[] = { "Aadya", "Anish", "Khushi", "Ishu" };
        String key = "Ishu";

        linearSearchforStrings(arr, key);
    }
}
