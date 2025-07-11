public class MaxSubarraySum_KadanesForOnlyNegative {

    public static void maxSubarraySum(int arr[]) {
        int currSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (currSum + arr[i] > arr[i]) {
                currSum = currSum + arr[i]; // Continue the subarray
            } else {
                currSum = arr[i]; // Start new subarray from current element
            }

            if (currSum > maxSum) {
                maxSum = currSum; // Update maxSum if needed
            }
        }

        System.out.println("The maximum subarray sum is: " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, -1, -5 };
        maxSubarraySum(arr); // Output: -1
    }
}
