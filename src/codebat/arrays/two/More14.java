package codebat.arrays.two;

public class More14 {

    public boolean more14(int[] nums) {

        int countOnes = 0;
        int countFours = 0;

        for(int num : nums){
            if(num == 1) {
                countOnes++;
            }
            if(num == 4){
                countFours++;
            }
        }

        return (countOnes > countFours);
    }
}

/*


Given an array of ints, return true if the number of 1's is greater than the number of 4's

more14([1, 4, 1]) → true
more14([1, 4, 1, 4]) → false
more14([1, 1]) → true
 */