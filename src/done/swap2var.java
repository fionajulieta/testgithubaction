package done;

public class swap2var {
    public static void main(String[] args) {

        String x = "water";
        String y = "Kool-Aid";
        String temp;

        temp = x;
        x=y;
        y=temp;

        /* we cannot swap it this way (cuz it will be contradictory:
        x=y
        y=x
        that's why we need a temporary variable to switch the 2 done.variables
         */

        System.out.println("x: "+x);
        System.out.println("y: "+y);
    }
}
