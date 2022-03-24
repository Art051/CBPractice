package codebat.arrays.one;

public class Array1_maxEnd3 {

    public int[] maxEnd3(int[] nums) {
        int maxValue = Math.max(nums[0], nums[nums.length -1]);
        return new int[]{maxValue, maxValue, maxValue};
    }
}

/*
Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.

maxEnd3([1, 2, 3]) → [3, 3, 3]
maxEnd3([11, 5, 9]) → [11, 11, 11]
maxEnd3([2, 11, 3]) → [3, 3, 3]
*/