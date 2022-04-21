package codebat.string.two;

public class endOther {

    public boolean endOther(String a, String b) {

        if (a.length() < b.length()) {
            if (a.toLowerCase().equals(b.toLowerCase().substring(b.length() - a.length()))) {
                return true;
            }
        }
        else if (b.length() < a.length()) {
            if (b.toLowerCase().equals(a.toLowerCase().substring(a.length() - b.length()))) {
                return true;
            }
        }
        else if (a.equals(b)) {
                return true;
            }
        return false;
    }
}

/*
Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.

endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true
 */