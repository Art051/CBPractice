package codebat.arrays.one;

public class Array1_double23 {

    public boolean double23(int[] nums) {

        int countTwo = 0;
        int countThree = 0;

        for (int num : nums) {
            switch (num) {
                case (2): countTwo++;  break;
                    case (3): countThree++; break;
            }
        }
        return (countTwo > 1) || (countThree > 1);
    }
}

/*
Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.

double23([2, 2]) → true
double23([3, 3]) → true
double23([2, 3]) → false
 */