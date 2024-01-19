package youtube;

import java.util.Scanner;

public class IfStatement9 {
    public static void main(String[] args) {

        // if statement = performs a block of code if it's condition evaluates to be true
        // the code will read the conditions according to the line sequence

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        if(age==75) {
            System.out.println("Oh so you are 75!");
        }
        else if(age>75) {
            System.out.println("Ok Boomer!");
        }
        else if(age>=18) {
            System.out.println("You are an adult!");
        }
        else if(age>=13) {
            System.out.println("You are a teenager!");
        }
        else {
            System.out.println("You are not an adult!");
        }

    }
}
