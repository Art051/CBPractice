package codebat.arrays.three;

public class LinearIn {

    public boolean linearIn(int[] outer, int[] inner) {

        int innerIndex = 0;
        int outerIndex = 0;


        while(innerIndex < inner.length && outerIndex < outer.length) {
            if (inner[innerIndex] > outer[outerIndex]) {
                outerIndex++;
            }
            else if(inner[innerIndex] < outer[outerIndex]){
                return false;
            }
            else{
                innerIndex++;
            }
        }

        if(innerIndex != inner.length){
            return false;
        }
        return true;
    }
}

/*
Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer.
The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.

linearIn([1, 2, 4, 6], [2, 4]) → true
linearIn([1, 2, 4, 6], [2, 3, 4]) → false
linearIn([1, 2, 4, 4, 6], [2, 4]) → true
 */