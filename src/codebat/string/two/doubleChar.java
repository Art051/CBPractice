package codebat.string.two;

public class doubleChar {

    public String doubleChar(String str) {

        StringBuilder newString = new StringBuilder("");
        for(char strChar : str.toCharArray()){
            newString.append(strChar).append(strChar);
        }
        return newString.toString();
    }
}

/*
Given a string, return a string where for every char in the original, there are two chars.

doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
 */

/*
Model answer (didn't use StringBuilder):

public String doubleChar(String str) {
  String result = "";
  for (int i = 0; i < str.length(); i++) {
    result = result + str.charAt(i) + str.charAt(i);
    // Alternately:
    // result = result + str.substring(i, i+1) + str.substring(i, i+1);
  }
  return result;
}
 */