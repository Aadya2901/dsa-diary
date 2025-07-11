// brute force 

public class PracticeQs12_1 {
    public static boolean containsDuplicate(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true; // duplicate found
                }
            }
        }

        return false; // no duplicates
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
 * For i from 0 to n-1:
 * For j from i+1 to n-1:
 * If nums[i] == nums[j]:
 * Return true // duplicate found
 * 
 * Return false // no duplicates found
 * 
 * Time Complexity: O(n²)
 * (Checks every possible pair of elements)
 * 
 * Space Complexity: O(1)
 * (No extra space used — only input array)
 */
