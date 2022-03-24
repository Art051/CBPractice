package codebat.maps.Two;

import java.util.HashMap;
import java.util.Map;

public class WordAppend {

    public String wordAppend(String[] strings) {

        Map<String, Integer> countStringOccurances = new HashMap<>();

        String result = "";

        for(String string : strings) {
            if(countStringOccurances.containsKey(string)) {
                countStringOccurances.remove(string);
                result = result.concat(string);
            }
            else {
                countStringOccurances.put(string, 1);
            }
        }
        return result;
    }

}

/*
Loop over the given array of strings to build a result string like this:
when a string appears the 2nd, 4th, 6th, etc. time in the array, append the string to the result.
Return the empty string if no string appears a 2nd time.

wordAppend(["a", "b", "a"]) → "a"
wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
wordAppend(["a", "", "a"]) → "a"
 */