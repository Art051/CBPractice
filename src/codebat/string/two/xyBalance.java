package codebat.string.two;

public class xyBalance {

    public boolean xyBalance(String str) {

        int lastX = -1;
        int lastY = -1;

        for(int i = 0; i < str.length(); i++){
            char currentChar = str.charAt(i);
            if(currentChar == 'x'){
                lastX = i;
            }
            else if(currentChar == 'y'){
                lastY = i;
            }
        }
        return lastX < lastY || lastX == lastY;
    }
}

/*
We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.

xyBalance("aaxbby") → true
xyBalance("aaxbb") → false
xyBalance("yaaxbb") → false
 */

/*
Model answer:
public boolean xyBalance(String str) {
  // Find the rightmost y
  int y = -1;
  for (int i = 0; i < str.length(); i++) {
    if (str.charAt(i)=='y') y = i;
  }

  // Look at the x's, return false if one is after y
  for (int i = 0; i < str.length(); i++) {
    if (str.charAt(i)=='x' && i > y) return false;
  }
  return true;

  // Solution notes: this solution uses two loops, each written the simple
  // 0..length way. You could do it with a single reverse loop, noticing
  // if you see an x before a y. Or use lastIndexOf().
}
 */