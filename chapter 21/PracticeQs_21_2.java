public class PracticeQs_21_2 {
    
}

/*
 * FUNCTION majorityElement(nums):
    RETURN majorityElementRec(nums, 0, length(nums) - 1)

FUNCTION majorityElementRec(nums, lo, hi):
    IF lo == hi:
        RETURN nums[lo]

    mid ← (hi - lo) / 2 + lo
    leftMajor ← majorityElementRec(nums, lo, mid)
    rightMajor ← majorityElementRec(nums, mid + 1, hi)

    IF leftMajor == rightMajor:
        RETURN leftMajor

    leftCount ← countInRange(nums, leftMajor, lo, hi)
    rightCount ← countInRange(nums, rightMajor, lo, hi)

    RETURN element with higher count

FUNCTION countInRange(nums, value, lo, hi):
    count ← 0
    FOR i from lo to hi:
        IF nums[i] == value:
            count ← count + 1
    RETURN count

 */