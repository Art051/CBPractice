package codebat.string.two;

public class xyzThere {

    public boolean xyzThere(String str) {

        boolean hasXYZ = false;
        if(str.length() < 3){
            return false;
        }
        else if(str.substring(0, 3).equals("xyz")){
            return true;
        }
        else {
            for (int i = 0; i < str.length() - 3; i++) {
                String subString = str.substring(i, i + 4);
                if (subString.matches("[^.]xyz")) {
                    hasXYZ =  true;
                }
            }
        }
        return hasXYZ;
    }
}

/*
Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.

xyzThere("abcxyz") → true
xyzThere("abc.xyz") → false
xyzThere("xyz.abc") → true
 */