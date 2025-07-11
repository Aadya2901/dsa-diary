public class TrappingRainwater {
    public static void trappingRainwater(int arr[]) {
        int n = arr.length;
        int trappedWater = 0;

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // Fill leftMax
        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i - 1]);
        }

        // Fill rightMax
        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i + 1]);
        }

        // Calculate trapped water
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - arr[i];
        }

        System.out.println("Total trapped rainwater = " + trappedWater);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 0, 6, 3, 2, 5 };

        trappingRainwater(arr);
    }
}

/*
 * Function TrappingRainwater(arr[0..n-1]):
 * Initialize leftMax[0..n-1]
 * Initialize rightMax[0..n-1]
 * Initialize trappedWater = 0
 * 
 * // Step 1: Compute leftMax array
 * leftMax[0] = arr[0]
 * for i from 1 to n-1:
 * leftMax[i] = max(arr[i], leftMax[i-1])
 * 
 * // Step 2: Compute rightMax array
 * rightMax[n-1] = arr[n-1]
 * for i from n-2 down to 0:
 * rightMax[i] = max(arr[i], rightMax[i+1])
 * 
 * // Step 3: Calculate total trapped water
 * for i from 0 to n-1:
 * waterLevel = min(leftMax[i], rightMax[i])
 * trappedWater += (waterLevel - arr[i])
 * 
 * Return trappedWater
 * 
 * t/c: O(n)
 */