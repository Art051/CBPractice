package codebat.arrays.three;

import java.util.Arrays;

public class CanBalance {

    public boolean canBalance(int[] nums) {

        int halfTotal = Arrays.stream(nums).sum() / 2;
        int forwardTotal = 0;
        int forwardIndex = 0;
        int reverseTotal = 0;

        for(int i = 0; i < nums.length; i++) {
            forwardTotal += nums[i];
            forwardIndex++;
            if (forwardTotal == halfTotal) {
                break;
            }
        }
        for(int j = nums.length - 1; j >= forwardIndex; j--) {
            reverseTotal += nums[j];
        }
        return forwardTotal == reverseTotal;
    }
}
/*
Given a non-empty array, return true if there is a place to split the array so that:
the sum of the numbers on one side is equal to the sum of the numbers on the other side.

canBalance([1, 1, 1, 2, 1]) → true
canBalance([2, 1, 1, 2, 1]) → false
canBalance([10, 10]) → true


 */
