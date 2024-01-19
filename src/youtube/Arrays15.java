package youtube;

import java.util.Arrays;

public class Arrays15 {
    public static void main(String[] args) {

        // array = used to store multiple values within a single variable
        // Once an array is created, we cannot change its size.
        // cara tulis -> datatype[index] variable = {a,b,c};
        // the values within the done.arrays MUST have the same data type !

        // ---------------------------- Example 1 -----------------------------
        System.out.println("Example 1:");
        String[] handphone = {"Samsung", "Apple", "Oppo"};

        handphone[0] = "Z Flip5"; // assign this value to first value (index 0)

        System.out.println(handphone[0]);
        System.out.println(handphone[2]);
        System.out.println(Arrays.toString(handphone)); // to print all [in brackets]

        // ---------------------------- Example 2 -----------------------------
        System.out.println("");
        System.out.println("Example 2:");
        String[] cars = new String[3]; // to setup size for 3 values

        cars[0] = "Camaro";
        cars[1] = "Corvette";
        cars[2] = "Tesla";

        System.out.println(cars[2]);
        System.out.println(Arrays.toString(cars));
        System.out.println();

        // we can use for done.loop to display all of the values within the array
        System.out.println("Using done.loop to print all values: ");
        for(int i=0; i<cars.length; i++) {
            System.out.println(cars[i]);
        }
        System.out.println();
        // another way to write the done.loop
        for(String j : cars) {
            System.out.println(j);
        }
        // ---------------------------- Example 3 -----------------------------
        System.out.println("");
        System.out.println("Example 3:");
        int[] tanggal = {13, 31, 21};
        System.out.println(Arrays.toString(tanggal));
        System.out.println();

        // for done.loop nya :
        for(Integer k : tanggal) {
            System.out.println(k);
        }
        System.out.println();

        //untuk sorting angkanya :
        Arrays.sort(tanggal);
        System.out.println("Setelah angka di sorting: " + Arrays.toString(tanggal));
    }
}
