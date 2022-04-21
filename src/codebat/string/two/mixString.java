package codebat.string.two;

public class mixString {

    public String mixString(String a, String b) {

        int lengthA = a.length();
        int lengthB = b.length();
        int maxSharedLength = Math.max(lengthA, lengthB);
        String newWord = "";

        for(int i = 0; i < maxSharedLength; i++){
            if(i <= lengthA - 1){
                newWord += a.substring(i, i + 1);
            }
            if(i <= lengthB - 1){
                newWord += b.substring(i, i + 1);
            }
        }
        return newWord;
    }
}

/*
Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.

mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"
 */