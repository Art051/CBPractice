package codebat.string.two;

public class xyzMiddle {

    public boolean xyzMiddle(String str) {

        int firstStartingPos = str.length() / 2 - 1;
        int secondStartingPos = str.length() / 2 - 2;

        if(str.length() < 3){
            return false;
        }

        if(str.length() % 2 == 0) {
            return str.substring(firstStartingPos, firstStartingPos + 3).equals("xyz") ||
                    str.substring(secondStartingPos, secondStartingPos + 3).equals("xyz");
        }

        return str.substring(firstStartingPos, firstStartingPos + 3).equals("xyz");
    }
}

/*
Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.

xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false
 */