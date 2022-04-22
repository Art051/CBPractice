package codebat.string.two;

public class oneTwo {

    public String oneTwo(String str) {

        StringBuilder reOrderedString = new StringBuilder();

        //to ignore any remaining substrings < 3 at the end, can use modulus operator to find and then remove the remainder substring:
        int charRange = str.length() - (str.length() % 3) + 1;

        for(int i = 0; i < charRange - 3; i += 3){
            reOrderedString.append(str.charAt(i + 1)).append(str.charAt(i + 2)).append(str.charAt(i));
        }
        return reOrderedString.toString();
    }
}

/*
Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca".
Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.
oneTwo("abc") → "bca"
oneTwo("tca") → "cat"
oneTwo("tcagdo") → "catdog"
 */