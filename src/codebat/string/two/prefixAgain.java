package codebat.string.two;

public class prefixAgain {

    public boolean prefixAgain(String str, int n) {

        String prefix = str.substring(0, n);
        String newString = str.substring(n);

        for(int i = 0; i < newString.length() - n; i++){
            if(newString.substring(i, i + n).equals(prefix)){
                return true;
            }
        }
        return false;
    }
}

/*
Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().

prefixAgain("abXYabc", 1) → true
prefixAgain("abXYabc", 2) → true
prefixAgain("abXYabc", 3) → false
 */