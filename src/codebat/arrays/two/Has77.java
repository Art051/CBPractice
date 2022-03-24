package codebat.arrays.two;

public class Has77 {

    public boolean has77(int[] nums) {

        boolean sevensTogether = false;
        boolean sevensApart = false;

        for (int i = 1; i <= nums.length - 2; i++) {
            if (nums[i - 1] == 7 && nums[i] == 7) {
                sevensTogether = true;
            }
            if (nums[i - 1] == 7 && nums[i + 1] == 7) {
                sevensApart = true;
            }
        }
        return sevensTogether ^ sevensApart;
    }
}
/*
COULDN'T FIGURE OUT - GITHUB ANSWER:

public boolean has77(int[] nums) {
    for(int i = 0; i < nums.length - 1; i++) {
        if(nums[i] == 7 && nums[i+1] == 7)
            return true;

        if(i <= nums.length - 3 && nums[i] == 7 && nums[i+2] == 7)
            return true;
    }

    return false;
}
 */

/*
Given an array of ints, return true if the array contains two 7's next to each other,
or there are two 7's separated by one element, such as with {7, 1, 7}.

has77([1, 7, 7]) → true
has77([1, 7, 1, 7]) → true
has77([1, 7, 1, 1, 7]) → false
 */