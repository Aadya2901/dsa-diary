public class FirstOccurence {
    public static int firstOccurence(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1; // ❗ base case: key not found
        }

        if (arr[i] == key) {
            return i;
        }

        return firstOccurence(arr, i + 1, key);
    }

    public static void main(String[] args) {
        int arr[] = { 18, 3, 6, 9, 5, 10, 2, 5, 3 };

        int key = 5;

        System.out.println("First occurrence of " + key + " is at index: " +
                firstOccurence(arr, 0, key));
    }
}
