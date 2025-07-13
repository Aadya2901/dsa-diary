
/*
 * FUNCTION Search(arr, target)
 * start ← 0
 * end ← length(arr) - 1
 * 
 * WHILE start ≤ end DO
 * mid ← start + (end - start) / 2
 * 
 * IF arr[mid] == target THEN
 * RETURN mid
 * END IF
 * 
 * // Left half is sorted
 * IF arr[start] <= arr[mid] THEN
 * IF arr[start] <= target AND target < arr[mid] THEN
 * end ← mid - 1
 * ELSE
 * start ← mid + 1
 * END IF
 * 
 * // Right half is sorted
 * ELSE
 * IF arr[mid] < target AND target <= arr[end] THEN
 * start ← mid + 1
 * ELSE
 * end ← mid - 1
 * END IF
 * END IF
 * END WHILE
 * 
 * RETURN -1 // target not found
 * END FUNCTION
 * 
 * Time Complexity
 * Time Complexity: O(log n)
 * 
 * Space Complexity: O(1) (iterative uses no recursion stack)
 */