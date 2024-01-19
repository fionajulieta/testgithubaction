package youtube;

import java.util.ArrayList;

public class ForEachLoop21 {
    public static void main(String[] args) {

        // for-each = 	traversing technique to iterate through the elements in an array/collection
        // Same as for-loop but require less steps and more readable
        // But it is less flexible

        //String[] animals = {"cat","dog","rat","bird"}; // Array
        ArrayList<String> animals = new ArrayList<String>(); // Array list

        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("bird");

        for (String i : animals) {
            System.out.println(i);
        }
        // ":" represent the word "in"
        // so the example above will read -> String i IN animals variable

    }
}
