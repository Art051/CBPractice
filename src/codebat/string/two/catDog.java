package codebat.string.two;

public class catDog {

    public boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;

        for(int i = 0; i < str.length() - 2; i++){
            String subStr = str.substring(i, i + 3);
            if(subStr.equals("cat")){
                catCount++;
            }
            if(subStr.equals("dog")){
                dogCount++;
            }
        }
        return (catCount == dogCount);
    }
}

/*
Return true if the string "cat" and "dog" appear the same number of times in the given string.

catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true
 */