/*
 * FUNCTION getInversions(arr):
 * RETURN mergeSort(arr, 0, length(arr) - 1)
 * 
 * FUNCTION mergeSort(arr, left, right):
 * invCount ← 0
 * IF right > left:
 * mid ← (left + right) / 2
 * invCount ← mergeSort(arr, left, mid)
 * invCount ← invCount + mergeSort(arr, mid + 1, right)
 * invCount ← invCount + merge(arr, left, mid + 1, right)
 * RETURN invCount
 * 
 * FUNCTION merge(arr, left, mid, right):
 * i ← left
 * j ← mid
 * k ← 0
 * temp ← empty array of size (right - left + 1)
 * invCount ← 0
 * 
 * WHILE i < mid AND j ≤ right:
 * IF arr[i] ≤ arr[j]:
 * temp[k] ← arr[i]
 * i ← i + 1
 * ELSE:
 * temp[k] ← arr[j]
 * invCount ← invCount + (mid - i)
 * j ← j + 1
 * k ← k + 1
 * 
 * ADD remaining elements from arr[i to mid-1] to temp
 * ADD remaining elements from arr[j to right] to temp
 * 
 * COPY temp back to arr[left to right]
 * 
 * RETURN invCount
 */