package codebat.string.two;

public class zipZap {

    public String zipZap(String str) {

        //if string isn't 3 or more chars, it can't contain any z-p combo, so return original string
        if(str.length() < 2){
            return str;
        }

        String newString = str.substring(0, 1);

        for(int i = 1; i < str.length() - 1; i++){
            if(str.charAt(i - 1) != 'z' || str.charAt(i + 1) != 'p'){
                newString += str.charAt(i);
            }
        }

        //add in the last char
        newString += str.substring(str.length() - 1);

        return newString;
    }
}

/*
Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".
zipZap("zipXzap") → "zpXzp"
zipZap("zopzop") → "zpzp"
zipZap("zzzopzop") → "zzzpzp"
 */