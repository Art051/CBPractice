package codebat.arrays.two;

public class Have3 {

    public boolean haveThree(int[] nums) {

        int count3 = 0;
        boolean prevWas3 = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                count3++;
                if (!prevWas3) {
                    prevWas3 = true;
                }
                else if (prevWas3) {
                    return false;
                }
            }
            else{
                prevWas3 = false;
            }
        }
        return count3 == 3;
    }
}
/*
Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.

haveThree([3, 1, 3, 1, 3]) → true
haveThree([3, 1, 3, 3]) → false
haveThree([3, 4, 3, 3, 4]) → false
 */
