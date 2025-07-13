public class SortedAndRotatedArray {
    public static int search(int arr[], int target, int start, int end) {

        // Base case
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        // If left half is sorted
        if (arr[start] <= arr[mid]) {

            // Case a: target in the left sorted part
            if (arr[start] <= target && target < arr[mid]) {
                return search(arr, target, start, mid - 1);
            }

            else {
                // Case b: target in right part
                return search(arr, target, mid + 1, end);
            }
        }

        // Else, right half must be sorted
        else {

            // Case c: target in the right sorted part
            if (arr[mid] < target && target <= arr[end]) {
                return search(arr, target, mid + 1, end);
            }

            else {
                // Case d: target in left part
                return search(arr, target, start, mid - 1);
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0; // output -> 4
        int targetIdx = search(arr, target, 0, arr.length - 1);

        System.out.println(targetIdx); // Should print 4
    }
}

/*
 * FUNCTION Search(arr, target, start, end)
 * IF start > end THEN
 * RETURN -1
 * END IF
 * 
 * mid ← start + (end - start) / 2
 * 
 * IF arr[mid] == target THEN
 * RETURN mid
 * END IF
 * 
 * // Check if left half is sorted
 * IF arr[start] <= arr[mid] THEN
 * IF arr[start] <= target AND target < arr[mid] THEN
 * RETURN Search(arr, target, start, mid - 1)
 * ELSE
 * RETURN Search(arr, target, mid + 1, end)
 * END IF
 * ELSE
 * // Right half is sorted
 * IF arr[mid] < target AND target <= arr[end] THEN
 * RETURN Search(arr, target, mid + 1, end)
 * ELSE
 * RETURN Search(arr, target, start, mid - 1)
 * END IF
 * END IF
 * END FUNCTION
 * 
 est Case: O(1)         // If target is found at mid
Worst Case: O(log n)    // Modified Binary Search

 */