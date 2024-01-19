package done;

import java.util.Scanner;

public class logicaloperators {
    public static void main(String[] args) {

        // logical operators = used to connect two or more expressions
        //		&& = (AND) both conditions must be true
        // 		|| = (OR) either condition must be true
        //		! = (NOT) reverses boolean value of condition

// -------------------------------- Example 1 --------------------------------
        Scanner scanner = new Scanner(System.in);
        System.out.println("-- Example 1 (AND operators) --");
        System.out.println("Input temperature: ");
        int temp = scanner.nextInt();

		if(temp>30) {
			System.out.println("It is hot outside");
		}
		else if(temp>=20 && temp<=30) {
			System.out.println("It is warm outside");
		}
		else {
			System.out.println("It is cold outside");
		}
// -------------------------------- Example 2 --------------------------------
        System.out.println("-- Example 2 (OR operators) --");
		System.out.println("You are playing a game! Press q or Q to quit");
		String response = scanner.next();

		if(response.equals("q") || response.equals("Q")) {
			System.out.println("You quit the game");
		}
		else {
			System.out.println("YOu are still playing the game *pew pew*");
		}
// -------------------------------- Example 3 --------------------------------
        System.out.println("-- Example 3 (NOT operators) --");
        // example 2 and 3 will have the same result
        // (only different in the code writing)
        System.out.println("You are playing a game! Press q or Q to quit");
        String response1 = scanner.next();

        if(!response1.equals("q") && !response1.equals("Q")) {
            System.out.println("YOu are still playing the game *pew pew*");
        }
        else {
            System.out.println("You quit the game");
        }
    }
}
