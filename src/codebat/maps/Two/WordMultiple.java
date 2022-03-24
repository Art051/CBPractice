package codebat.maps.Two;

import java.util.HashMap;
import java.util.Map;

public class WordMultiple {

    public Map<String, Boolean> wordMultiple(String[] strings) {

        Map<String, Boolean> occursTwiceOrMore = new HashMap<>();

        for(String string : strings) {
            if(occursTwiceOrMore.containsKey(string)) {
                occursTwiceOrMore.put(string, true);
            }
            else {
                occursTwiceOrMore.put(string, false);
            }
        }

        return occursTwiceOrMore;
    }

}

/*
Given an array of strings, return a Map<String, Boolean> where each different string is a key and its value is true if that string appears 2 or more times in the array.

wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"]) → {"c": true}
 */