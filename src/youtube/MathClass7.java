package youtube;

import java.util.Scanner;

public class MathClass7 {
    public static void main(String[] args) {

        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x)+(y*y)); // √(a2+b2)

        System.out.println("The hypotenuse is : "+z);

        scanner.close(); // not necessary but is better to close it

    }
}