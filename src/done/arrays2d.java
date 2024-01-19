package done;

public class arrays2d {
    public static void main(String[] args) {
        // 2D array = an array of done.arrays
        // cara tulis -> datatype[# done.arrays][# elements] variable = {a,b,c};
        // the values within the done.arrays MUST have the same data type !

        // ------------------------ Manual method ------------------------
		String[][] tea = new String[3][3];

		tea[0][0] = "black tea";
		tea[0][1] = "green tea";
		tea[0][2] = "matcha";
		tea[1][0] = "hojicha";
		tea[1][1] = "rose tea";
		tea[1][2] = "oolong tea";
		tea[2][0] = "lemon tea";
		tea[2][1] = "earl grey";
		tea[2][2] = "milk tea";

        // nested for done.loop to display
        for(int i=0; i<tea.length; i++) {
            System.out.println();
            for(int j=0; j<tea[i].length; j++) {
                System.out.print(tea[i][j]+" | ");
            }
        }
        System.out.println();
        // ---------------------- Simplified method ----------------------

        String[][] cars = 	{
                {"Camaro","Corvette","Silverado"},
                {"Mustang","Ranger","F-150"},
                {"Ferrari","Lambo","Tesla"}
        };

        // nested for done.loop to display
        for(int i=0; i<cars.length; i++) {
            System.out.println();
            for(int j=0; j<cars[i].length; j++) {
                System.out.print(cars[i][j]+" | ");
            }
        }
    }
}
