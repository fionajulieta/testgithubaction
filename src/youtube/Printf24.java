package youtube;

public class Printf24 {
    public static void main(String[] args) {
        // printf() = 	an optional method to control, format, and display text to the console window
        //				two arguments = format string + (object/variable/value)
        //				% [flags] [precision] [width] [conversion-character]
        // printf does not add an enter unless you add \n to the arguments or add println manually

        // How to add the arguments (format specifier location [e.g. %d]):
        System.out.printf("How to add an printf arguments %d\n", 123);
        System.out.printf("%d How to add an printf arguments\n", 123);
        System.out.printf("How%d to add an printf arguments\n", 123);
        System.out.printf("How to add %d an printf arguments\n\n", 123);

        // ========================= Format specifier: =========================
        // *format specifier used must match the data type of the variable/value*
        int myInt = 50;
        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Fiona";
        double myDouble = 1000.05;

        // ----------------------- [conversion-character] -----------------------
        // %d : to add the value (integer/decimal) stated in the arguments to a String " "
        System.out.printf("1. integer example: %d\n",myInt);

        // %b : to add the value (boolean) stated in the arguments to a String " "
        System.out.printf("2. boolean example: %b\n",myBoolean);

        // %c : to add the value (char) stated in the arguments to a String " "
        System.out.printf("3. char example: %c\n",myChar);

        // %s : to add the value (String) stated in the arguments to a String " "
        System.out.printf("4. String example: %s\n",myString);

        // %f : to add the value (double/float) stated in the arguments to a String " "
        System.out.printf("5. double/float example: %f\n",myDouble);
        // will display default 6 digits after decimal

        // ----------------------- [width] -----------------------
        // The minimum number of characters to be written as output
        System.out.printf("6. adding width example: %10s\n",myString);
        // example above: adding 10 empty space (include the added value) to the String

        // ----------------------- [precision] -----------------------
        // sets number of digits of precision when outputting floating-point values
        System.out.printf("7. adding decimal digit limit example: %.3f\n",myDouble);

        // ----------------------- [flags] -----------------------
        // adds an effect to output based on the flag added to format specifier
        // - : left-justify
        System.out.printf("8. left justify example: %-10s mark\n",myString);
        System.out.printf("9. right justify example: %10s mark\n",myString);

        // + : output a plus ( + ) or minus ( - ) sign for a numeric value
        System.out.printf("10. adding plus sign example: %+f\n",myDouble);

        // 0 : numeric values are zero-padded
        System.out.printf("11. add 0 before the added value example: %05d\n",myInt);
        // example above: add 0s in front of the integer until total number displayed is 10

        // , : comma grouping separator if numbers > 1000 (separate thousands)
        System.out.printf("12. add comma separator for thousands example: %,.2f",myDouble);
    }
}
