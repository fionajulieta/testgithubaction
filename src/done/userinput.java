package done;

import java.util.Scanner; //java.util is a package, while Scanner is a class of the java.util package

public class userinput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();

        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine();
        /* empty nextLine scanner is needed bcz nextInt
        didn't remove new line code '\n'
        and might affect next scanner
         */

        System.out.println("What is your favorite food?");
        String food = scanner.nextLine();

        System.out.println("Hello "+name);
        System.out.println("You are "+age+" years old");
        System.out.println("You like "+food);

    }
}
