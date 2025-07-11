import java.util.Arrays;

public class PracticeQs12_1_2 {

    public static boolean containsDuplicate(int[] nums) {
        // Step 1: Sort the array
        Arrays.sort(nums);

        // Step 2: Check adjacent elements
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true; // Duplicate found
            }
        }

        return false; // All elements are distinct
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 1 };
        int[] nums2 = { 1, 2, 3, 4 };
        int[] nums3 = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };

        System.out.println(containsDuplicate(nums1)); // true
        System.out.println(containsDuplicate(nums2)); // false
        System.out.println(containsDuplicate(nums3)); // true
    }
}

/*
 * Function containsDuplicate(nums[0..n-1]) → boolean
 * Sort the array nums in non-decreasing order
 * 
 * For i from 0 to n-2:
 * If nums[i] == nums[i + 1]:
 * Return true // duplicate found
 * 
 * Return false // all elements are distinct
 * 
 * Function containsDuplicate(nums[0..n-1]) → boolean
 * Sort the array nums in non-decreasing order
 * 
 * Time O(n log n)
 * Space Complexity: O(1) if sort is in-place
 */