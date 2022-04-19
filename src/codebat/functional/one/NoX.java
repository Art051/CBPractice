package codebat.functional.one;

import java.util.List;
import java.util.stream.Collectors;

public class NoX {

//    Stackoverflow top reply to a previous question states using the following is preferrable (over .stream.foreach) :
//    .stream       OVER        .stream
//    .map                      .forEach
//    .collect

    public List<String> noX(List<String> strings) {

        return strings.stream()
                .map(s -> s.replaceAll("x",""))
                .collect(Collectors.toList());
    }
}

/*
Given a list of strings, return a list where each string has all its "x" removed.

noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
noX(["x"]) → [""]
 */