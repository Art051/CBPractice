package codebat.string.two;

public class getSandwich {

    public String getSandwich(String str) {

        //String cannot be less than 10 letters long (bread+bread)
        if(str.length() <= 10){
            return "";
        }

        //find the first occurance of 'bread'
        //find second occurance of 'bread'
        // store these indices and then use those index points as the substring to return

        int firstIndex = -1;
        int secondIndex = -1;

        //finding first 'bread',
        // break once it's been found once, otherwise will continue to search for more occurances
        for(int i = 0; i < str.length() - 5; i++){
            if(str.substring(i, i + 5).equals("bread")){
                firstIndex = i + 5;
                break;
            }
        }

        //finding second 'bread'
        // break once it's been found once, otherwise will continue to search for more occurances
        for(int i = str.length() - 5; i >= 0; i--){
            if(str.substring(i, i + 5).equals("bread")){
                secondIndex = i;
                break;
            }
        }

        //returning substring between the first and last occurance of "bread"
        return str.substring(firstIndex, secondIndex);
    }
}

/*


A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.

getSandwich("breadjambread") → "jam"
getSandwich("xxbreadjambreadyy") → "jam"
getSandwich("xxbreadyy") → ""
 */