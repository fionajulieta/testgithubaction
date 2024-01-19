package youtube.oop26;

public class Main26 {
    public static void main(String[] args) {

        Car26 myCar1 = new Car26();
        Car26 myCar2 = new Car26();

        // printing 1st car
        System.out.println(myCar1.make);
        System.out.println(myCar1.model);
        System.out.println(myCar1.color);
        System.out.println(myCar1.price);
        System.out.println();

        // printing 2nd car
        System.out.println(myCar2.make);
        System.out.println(myCar2.model);
        System.out.println(myCar2.color);
        System.out.println(myCar2.price);
        System.out.println();

        // printing both car's 2 existing methods
        myCar1.drive();
        myCar2.brake();
    }
}
