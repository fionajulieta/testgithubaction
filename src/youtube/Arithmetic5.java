package youtube;

public class Arithmetic5 {
    public static void main(String[] args) {

        // expression =     operands & operators
        // operands =  values, done.variables, numbers, quantity
        // operators = + - * / %
        /*printer will always follow code sequence
        (what comes first will always be executed first)
         */

        int friends = 10;

        int plus = friends + 2; // 10 + 2
        System.out.println(plus); // will print 12

        int min = friends - 2; // 10 - 2
        System.out.println(min); // will print 8

        plus++; // another way to add 1 to variable friendsplus above (12)
        System.out.println(plus); // will print 13

        min--;// another way to minus 1 to variable friendsmin above (8)
        System.out.println(min); // will print 7

        int multiply = friends * 2; // multiplication
        int division = friends / 2; // division
        int remainder = friends % 3; // remainder of division
        System.out.println(multiply);
        System.out.println(division);
        System.out.println(remainder);

        //to convert data type
        double data = 20;

        data = (double) data/3;
        System.out.println(data);
    }
}
