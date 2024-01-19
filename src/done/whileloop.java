package done;

import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {

        // while done.loop = executes a block of code as long as a it's condition remains true

        Scanner scanner = new Scanner(System.in);
        String name = "";
        String middlename="";

        while(name.isBlank()) {
            System.out.print("Enter your name: ");
            // gapake println supaya jawabannya ga ke enter dibawah perintah
            name = scanner.nextLine();
        }

        // another way to write while done.loop
        do {
            System.out.print("Enter your middle name: ");
            middlename = scanner.nextLine();
        } while(middlename.isBlank());

        System.out.println("Welcome "+name+" "+middlename);
    }
}
