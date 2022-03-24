package codebat.arrays.two;

public class No14 {

    public boolean no14(int[] nums) {
        boolean contains1 = false;
        boolean contains4 = false;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1)
                contains1 = true;

            if(nums[i] == 4)
                contains4 = true;
        }

        return !contains1 || !contains4;
    }
}

/*
Given an array of ints, return true if it contains no 1's or it contains no 4's.

no14([1, 2, 3]) → true
no14([1, 2, 3, 4]) → false
no14([2, 3, 4]) → true
 */