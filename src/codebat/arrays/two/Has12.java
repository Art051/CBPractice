package codebat.arrays.two;

public class Has12 {

    public boolean has12(int[] nums) {

        int indexA = 1;
        int indexB = 0;

        for(int i = 0; i < nums.length; i++){
            switch(nums[i]){
                case (1) : indexA = i;
                case (2) : indexB = i;
            }
        }

        return indexA < indexB;
    }
}

/*
Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.

has12([1, 3, 2]) → true
has12([3, 1, 2]) → true
has12([3, 1, 4, 5, 2]) → true
 */