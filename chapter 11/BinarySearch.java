public class BinarySearch {
    public static int binarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                System.out.println("Element found at index " + mid);
                return mid;
            }

            if (key < arr[mid]) {
                end = mid - 1;
            }

            else {
                start = mid + 1;
            }
        }

        System.out.println("Element not found");
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 10;

        binarySearch(arr, key);
    }
}