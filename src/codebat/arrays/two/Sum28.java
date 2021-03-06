package codebat.arrays.two;

public class Sum28 {

    public boolean sum28(int[] nums) {

        int sumTwos = 0;

        for(int num : nums){
            if(num == 2){
                sumTwos += num;
            }
        }
        return (sumTwos == 8);
    }
}

/*


Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.

sum28([2, 3, 2, 2, 4, 2]) → true
sum28([2, 3, 2, 2, 4, 2, 2]) → false
sum28([1, 2, 3, 4]) → false
 */
