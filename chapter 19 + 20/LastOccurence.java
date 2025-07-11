public class LastOccurence {
    public static int lastOccurence(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1; // ❗ base case: key not found
        }

        // Recursive call first (post-order)
        int isFound = lastOccurence(arr, i + 1, key);

        // If found later, return it, else check current
        if (isFound != -1) {
            return isFound;
        }

        if (arr[i] == key) {
            return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 18, 3, 6, 9, 5, 10, 2, 5, 3 };

        int key = 5;

        System.out.println("Last occurrence of " + key + " is at index: " +
                lastOccurence(arr, 0, key));
    }
}

/*
 * FUNCTION lastOccurence(arr, i, key):
 * IF i == length of arr:
 * RETURN -1
 * 
 * indexFromRest = lastOccurence(arr, i + 1, key)
 * 
 * IF indexFromRest ≠ -1:
 * RETURN indexFromRest
 * IF arr[i] == key:
 * RETURN i
 * RETURN -1
 * 
 * Time Complexity:
 * O(n) – One recursive call per array element
 * 
 * 💾 Space Complexity:
 * O(n) – Due to recursion stack
 */