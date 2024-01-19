package youtube;

import java.util.ArrayList;

public class ArrayList2D20 {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");
        System.out.println(bakeryList.get(1)); // use "get(index)" to retrieve specific item

        ArrayList<String> produceList = new ArrayList();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("soda");
        drinksList.add("coffee");

        // 2D array list (a list inside list):
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        // Print out :
        System.out.println(groceryList); // to print all list inside the main list
        System.out.println(groceryList.get(0).get(1)); // to get the 2nd item in the 1st list
        // to retrieve specific item: write get 2x (1st one is the list index, 2nd one is the item index)

    }
}
