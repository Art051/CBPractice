package codebat.arrays.three;

public class SquareUp {

    public int[] squareUp(int n) {

        int[] result = new int[n * n];
        int loopCount = 1;

        if(n == 0) {
            return result;
        }
        for(int i = n - 1; i < result.length; i += n) {
            int index = i;
            for(int j = 1; j <= loopCount; j++) {
                if(j == 0) {
                    break;
                }
                result[index] = j;
                index--;
            }
            loopCount++;
        }
        return result;
    }
}

/*
Given n>=0, create an array length n*n with the following pattern,
shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).

squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
squareUp(2) → [0, 1, 2, 1]
squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
 */