package youtube;

import java.util.ArrayList;

public class ArrayList19 {
    public static void main(String[] args) {

        // ArrayList = 	a resizable array ***
        // Elements can be added and removed after compilation phase
        // Only store reference data types
        // For primitive data types, need to use wrapper class
        // use < > to indicate the stored data type

        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");
        food.add("pear");
        food.add("not food");

        food.set(3, "sushi"); //to replace the value according to the index
        food.remove(4);
        food.clear(); // to clear all of the stored data

        /* reminder: the end result of this java program will follow the code sequence
        So, if clear is the last code, java will return blank result*/

        for(int i=0; i<food.size(); i++) {
            System.out.println(food.get(i));
        }
    }
}
