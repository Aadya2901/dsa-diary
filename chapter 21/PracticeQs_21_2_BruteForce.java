/*
 * FUNCTION majorityElement(arr):
 * n ← length(arr)
 * majorityCount ← floor(n / 2)
 * 
 * FOR i from 0 to n-1:
 * count ← 0
 * FOR j from 0 to n-1:
 * IF arr[i] == arr[j]:
 * count ← count + 1
 * IF count > majorityCount:
 * RETURN arr[i]
 * 
 * RETURN -1 // No majority element found
 */