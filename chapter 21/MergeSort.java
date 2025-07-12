public class MergeSort {
    public static void mergeSort(int arr[], int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    public static void merge(int arr[], int left, int mid, int right) {
        int temp[] = new int[right - left + 1];
        int i = left; // iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0; // iterator for temp arr

        // Merge both halves into temp
        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            }

            else {
                temp[k] = arr[j];
                j++;
            }

            k++;
        }

        // Copy remaining elements of left half
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements of right half
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // Copy temp[] back to original arr[]
        for (int t = 0; t < temp.length; t++) {
            arr[left + t] = temp[t]; // ❗ fixed: copy back using left + t
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };

        mergeSort(arr, 0, arr.length - 1);

        // Print sorted array
        printArr(arr);
    }
}

/*
 * mergeSort(arr, left, right):
 * if left >= right:
 * return
 * mid = (left + right) / 2
 * mergeSort(arr, left, mid)
 * mergeSort(arr, mid+1, right)
 * merge(arr, left, mid, right)
 * 
 * ime Complexity: O(n log n)
 * 💾 Space Complexity: O(n) (for temp array)
 */