package codebat.functional.two;

import java.util.List;
import java.util.stream.Collectors;

public class noNeg {

    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n >= 0)
                .collect(Collectors.toList());
    }
}

/*
Given a list of integers, return a list of the integers, omitting any that are less than 0.

noNeg([1, -2]) → [1]
noNeg([-3, -3, 3, 3]) → [3, 3]
noNeg([-1, -1, -1]) → []
 */

/*
Model answer (my method is one of two model answers, alternative is as follows) :
public List<Integer> noNeg(List<Integer> nums) {
  nums.removeIf(n -> n < 0);
  return nums;
 */