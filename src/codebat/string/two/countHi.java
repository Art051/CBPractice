package codebat.string.two;

public class countHi {

    public int countHi(String str) {

        int hiCount = 0;

        for(int i = 0; i < str.length() - 1; i++){
            if(str.substring(i, i + 2).equals("hi")){
                hiCount++;
            }
        }
        return hiCount;
    }
}

/*
Return the number of times that the string "hi" appears anywhere in the given string.

countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2
 */