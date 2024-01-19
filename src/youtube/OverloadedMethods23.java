package youtube;

public class OverloadedMethods23 {
    // overloaded methods = a methods to share the same method name but have different parameters
    // method principle -> method name + parameters = a signature/unique method
    // format -> static [datatype/void] [method name] ([parameter 1], [parameter 2],...) { }
    // *void is used if we don't want to return anything

    public static void main(String args[]) {
        int x = add(1, 2);
        System.out.println("Hasil add integer: " + x);

        System.out.println();

        double y = add(4.2, 5.3, 6.0);
        System.out.println("Hasil add double: " + y);
    }

    static int add(int a, int b) {
        System.out.println("Penambahan 2 integer");
        return a + b;
    }
    static int add(int a, int b, int c) {
        System.out.println("Penambahan 3 integer");
        return a + b + c;
    }
    static int add(int a, int b, int c, int d) {
        System.out.println("Penambahan 4 integer");
        return a + b + c + d;
    }
    static double add(double a, double b) {
        System.out.println("Penambahan 2 double");
        return a + b;
    }
    static double add(double a, double b, double c) {
        System.out.println("Penambahan 3 double");
        return a + b + c;
    }
    static double add(double a, double b, double c, double d) {
        System.out.println("Penambahan 4 double");
        return a + b + c + d;
    }
}