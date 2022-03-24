package codebat.arrays.two;

public class Has22 {

    public boolean has22(int[] nums) {
        int lastNum = 0;

        for(int num : nums){
            if(num == 2 && lastNum == 2){
                return true;
            }
            else {
                lastNum = num;
            }
        }
        return false;
    }
}

/*
Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.

has22([1, 2, 2]) → true
has22([1, 2, 1, 2]) → false
has22([2, 1, 2]) → false
 */