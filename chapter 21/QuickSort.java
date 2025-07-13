public class QuickSort {
    public static void quickSort(int arr[], int left, int right) {
        if (left >= right) {
            return;
        }

        // Choose pivot and partition
        int pIdx = partition(arr, left, right);

        // Recursively sort left and right parts
        quickSort(arr, left, pIdx - 1); // Left part
        quickSort(arr, pIdx + 1, right); // Right part
    }

    public static int partition(int arr[], int left, int right) {
        int pivot = arr[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot at correct position
        i++;
        int temp = arr[i];
        arr[i] = arr[right];
        arr[right] = temp;

        return i; // Return pivot index
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };

        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
