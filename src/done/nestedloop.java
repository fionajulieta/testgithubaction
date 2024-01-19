package done;

import java.util.Scanner;

public class nestedloop {
    public static void main(String[] args) {

        // nested loops = a done.loop inside of a done.loop

        Scanner scanner = new Scanner(System.in);
        int rows; // outer done.loop
        int columns; // inner done.loop
        String symbol = "";

        System.out.println("Enter # of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter # of columns: ");
        columns = scanner.nextInt();
        System.out.println("Enter symbol to use: ");
        symbol = scanner.next();

        for(int i=1; i<=rows; i++) {
            System.out.println(); // added so that the cursor will move to the next row
            for(int j=1; j<=columns;j++) {
                System.out.print(symbol);
        // So the code will make the row available first (outerloop)
        // and then will run the column (will add 1 symbol according to column number (inner done.loop)
        // then it will create another row and run the column again until the number of row is same as the index
            }
        }
    }
}
