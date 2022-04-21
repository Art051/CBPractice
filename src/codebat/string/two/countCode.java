package codebat.string.two;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class countCode {

    public int countCode(String str) {

        int countOccurrences = 0;

        for(int i = 0; i < str.length() - 3; i++){
            String subString = str.substring(i, i + 4);
            if(subString.matches("co.*e")){
                countOccurrences++;
            }
        }
        return countOccurrences;
    }
}

/*
Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.

countCode("aaacodebbb") → 1
countCode("codexxcode") → 2
countCode("cozexxcope") → 2
 */