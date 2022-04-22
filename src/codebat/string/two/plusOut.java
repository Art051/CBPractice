package codebat.string.two;

public class plusOut {

    public String plusOut(String str, String word) {

        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i <= str.length() - word.length()) {
                String currentSubString = str.substring(i, i+word.length());
                if (currentSubString.equals(word)) {
                    newString.append(word);
                    i += word.length()-1;
                }
                else
                    newString.append("+");
            }
            else
                newString.append("+");
        }
        return newString.toString();
    }
}

/*
Given a string and a non-empty word string,
return a version of the original String where all chars have been replaced by pluses ("+"),
except for appearances of the word string which are preserved unchanged.
plusOut("12xy34", "xy") → "++xy++"
plusOut("12xy34", "1") → "1+++++"
plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
 */