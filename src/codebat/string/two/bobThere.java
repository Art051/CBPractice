package codebat.string.two;

public class bobThere {

    public boolean bobThere(String str) {

        for(int i = 0; i < str.length() - 2; i++){
            String subString = str.substring(i, i + 3);
            if(subString.matches("b.*b")){
                return true;
            }
        }
        return false;
    }
}

/*
Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.

bobThere("abcbob") → true
bobThere("b9b") → true
bobThere("bac") → false
 */