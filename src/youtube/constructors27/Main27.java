package youtube.constructors27;

public class Main27 {
    public static void main(String[] args) {

        // constructors: special method that is called when an object is instantiated (created)

        Human27 human1 = new Human27("Rick",65,70);
        Human27 human2 = new Human27("Morty",16,50);

        // to access the constructed data
        System.out.println(human1.name);
        System.out.println(human2.weight);
        System.out.println();

        // how to access an object attributes from within it's class itself (use method)
        human1.drink();
        human2.eat();

    }
}
