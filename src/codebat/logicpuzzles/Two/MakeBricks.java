package codebat.logicpuzzles.Two;

public class MakeBricks {

    public boolean makeBricks(int small, int big, int goal) {

        return false;
    }
}

/*
We want to make a row of bricks that is goal inches long.
We have a number of small bricks (1 inch each) and big bricks (5 inches each).
Return true if it is possible to make the goal by choosing from the given bricks.
This is a little harder than it looks and can be done without any loops. See also: Introduction to MakeBricks

makeBricks(3, 1, 8) → true
makeBricks(3, 1, 9) → false
makeBricks(3, 2, 10) → true
 */

/*
Expected	Run
makeBricks(3, 1, 8) → true	true	OK
makeBricks(3, 1, 9) → false	true	X
makeBricks(3, 2, 10) → true	false	X
makeBricks(3, 2, 8) → true	true	OK
makeBricks(3, 2, 9) → false	true	X
makeBricks(6, 1, 11) → true	true	OK
makeBricks(6, 0, 11) → false	ArithmeticException: / by zero (line:3)	X
makeBricks(1, 4, 11) → true	true	OK
makeBricks(0, 3, 10) → true	true	OK
makeBricks(1, 4, 12) → false	true	X
 */