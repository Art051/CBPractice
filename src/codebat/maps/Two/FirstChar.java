package codebat.maps.Two;

import java.util.HashMap;
import java.util.Map;

public class FirstChar {

    public static  Map<String, String> firstChar(String[] strings) {

        Map<String, String> firstChars = new HashMap<>();

        for(String string : strings) {
            String firstChar = string.substring(0,1);
            if(!(firstChars.containsKey(firstChar))){
                firstChars.put(firstChar, string);
            }
            else {
                String existingValue = firstChars.get(firstChar);
                firstChars.put(firstChar, existingValue + string);

            }
        }
        return firstChars;
    }
}

/*
Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen, with the value of all the strings starting with that character appended together in the order they appear in the array.

firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
firstChar([]) → {}
 */

/*
Wasn't sure - answer from github:


public String[] firstSwap(String[] strings) {
  String[] result=new String[strings.length];
  Map<Character, Integer> map = new HashMap<Character, Integer>();
  for (int i = 0; i < strings.length; i++) {
    char c  = strings[i].charAt(0);
    if (map.containsKey(c)&&map.get(c)>=0)
    {
      int p=map.get(c);
      map.put(c,-1);

      result[i]=result[p];
      result[p]=strings[i];
    }
    else
    {
      result[i]=strings[i];
      if (!map.containsKey(c))
      map.put(c,i);
    }
  }
return result;
}
 */