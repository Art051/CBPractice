package codebat.string.two;

public class starOut {

    public String starOut(String str) {

        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*'){
                continue;
            }
            if (i > 0 && str.charAt(i - 1) == '*') {
                continue;
            }
            if (i < str.length() - 1 && str.charAt(i + 1) == '*') {
                continue;
            }
            newString.append(str.charAt(i));
        }
        return newString.toString();
    }
}

/*
Return a version of the given string, where for every star (*) in the string
the star and the chars immediately to its left and right are gone.
So "ab*cd" yields "ad" and "ab**cd" also yields "ad".

starOut("ab*cd") → "ad"
starOut("ab**cd") → "ad"
starOut("sm*eilly") → "silly"
 */