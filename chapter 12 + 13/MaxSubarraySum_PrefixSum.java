public class MaxSubarraySum_PrefixSum {
    public static void maxSubarraySum(int arr[]) {
        int currSum = 0;
        int prefix[] = new int[arr.length];
        int maxSum = Integer.MIN_VALUE;

        prefix[0] = arr[0];

        // Create prefix sum array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Check all subarrays
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) { // ✅ j starts from i
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("The maximum subarray sum is: " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        maxSubarraySum(arr);
    }
}
