public class PracticeQs_21_1 {

}

/*
 * FUNCTION mergeSort(arr, lo, hi):
 * IF lo == hi:
 * RETURN [arr[lo]]
 * mid ← lo + (hi - lo) / 2
 * left ← mergeSort(arr, lo, mid)
 * right ← mergeSort(arr, mid + 1, hi)
 * RETURN merge(left, right)
 * 
 * FUNCTION merge(arr1, arr2):
 * Initialize mergedList as empty list
 * i ← 0, j ← 0
 * 
 * WHILE i < length(arr1) AND j < length(arr2):
 * IF arr1[i] comes before arr2[j] alphabetically:
 * Add arr1[i] to mergedList
 * i ← i + 1
 * ELSE:
 * Add arr2[j] to mergedList
 * j ← j + 1
 * 
 * ADD remaining elements from arr1 (if any) to mergedList
 * ADD remaining elements from arr2 (if any) to mergedList
 * 
 * RETURN mergedList
 * 
 * FUNCTION isAlphabeticallySmaller(str1, str2):
 * RETURN TRUE if str1 < str2 lexicographically ELSE FALSE
 * 
 */