package codebat.functional.one;

import java.util.List;

public class MoreY {

    public List<String> moreY(List<String> strings) {
        strings.replaceAll(s -> "y".concat(s).concat("y"));
        return strings;
    }
}

/*
Given a list of strings, return a list where each string has "y" added at its start and end.

moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"]
moreY(["hello", "there"]) → ["yhelloy", "ytherey"]
moreY(["yay"]) → ["yyayy"]


 */