package youtube;

import java.util.Scanner;

public class Switch10 {
    public static void main(String[] args) {

        // switch = statement that allows a variable to be tested for equality against a list of values
        // break statement is important to stop the code run

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day: ");
        String day = scanner.nextLine();

        switch(day) {
            case "Sunday": System.out.println("It is Sunday!");
                break;
            case "Monday": System.out.println("It is Monday!");
                break;
            case "Tuesday": System.out.println("It is Tuesday!");
                break;
            case "Wednesday": System.out.println("It is Wednesday!");
                break;

            // no break example: (will print all code after "Thursday")
            case "Thursday": System.out.println("It is Thursday!");
            case "Friday": System.out.println("It is Friday!");
            case "Saturday": System.out.println("It is Saturday!");
            default: System.out.println("That is not a day!");
        }

    }
}
