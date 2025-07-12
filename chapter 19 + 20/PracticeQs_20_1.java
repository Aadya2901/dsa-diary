public class PracticeQs_20_1 {
    public static void allOccurences(int arr[], int i, int key) {

        if (i == arr.length) {
            return;
        }

        if (arr[i] == key) {
            System.out.print(i + " ");
        }

        allOccurences(arr, i + 1, key);
    }

    public static void main(String[] args) {
        int arr[] = {
                3, 2, 4, 5, 6, 2, 7, 2, 2
        };

        allOccurences(arr, 0, 2);
    }
}
