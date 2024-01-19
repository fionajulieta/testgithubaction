package youtube;

public class WrapperClasses18 {
    public static void main(String[] args) {
        // wrapper class = 	provides a way to use primitive data types as reference data types
        //					reference data types contain useful methods
        //                  primitive data type cannot use methods
        //					can be used with collections (ex.ArrayList)

        //primitive		//wrapper (change primitive to reference data type)
        //---------		//-------
        // boolean		Boolean
        // char			Character
        // int			Integer
        // double		Double

        /* autoboxing = the automatic conversion that the Java compiler makes between the primitive
        types and their corresponding object wrapper classes */
        // unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive

        Boolean a = false;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        boolean e = false;

        Boolean example = a.equals(false); // can use method bcs its reference data type
        // boolean example1 = e.equals(false); // will give an error bcs its a primitive data type
        System.out.println("example: " + example);
        //System.out.println(example1);
    }
}
