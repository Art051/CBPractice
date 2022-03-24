package codebat.arrays.two;

public class ModThree {

    public boolean modThree(int[] nums) {

        int countConsecEven = 0;
        int countConsecOdd = 0;

        for(int num : nums){
            if(num % 2 == 0){
                countConsecEven++;
                if(countConsecOdd < 3) {
                    countConsecOdd = 0;
                }
            }
            else {
                countConsecOdd++;
                if(countConsecEven < 3){
                    countConsecEven = 0;
                }
            }
        }
        return ((countConsecEven == 3) || (countConsecOdd == 3));
    }
}

/*
Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.

modThree([2, 1, 3, 5]) → true
modThree([2, 1, 2, 5]) → false
modThree([2, 4, 2, 5]) → true
 */