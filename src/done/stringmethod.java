package done;

public class stringmethod {
    public static void main(String[] args) {
        // String = a reference data type that can store one or more characters
        // reference data types have access to useful methods

        String name = "Fiona";
        String name1 = "      Fiona Julieta     ";

        boolean result0 = name.equals("fiona"); // returns false bcs its case-sensitive
        boolean result1 = name.equalsIgnoreCase("fiona"); // to ignore case-sensitive
        int result2 = name.length();
        char result3 = name.charAt(3); // number inside () is the index
        int result4 = name.indexOf("o"); // returns the index of ()
        boolean result5 = name.isEmpty(); // to check if the value is empty or not
        String result6 = name.toUpperCase();
        String result7 = name.toLowerCase();
        String result8 = name1.trim(); // to remove empty space in the value
        String result9 = name.replace('o', 'a');

        System.out.println("0: "+result0);
        System.out.println("1: "+result1);
        System.out.println("2: "+result2);
        System.out.println("3: "+result3);
        System.out.println("4: "+result4);
        System.out.println("5: "+result5);
        System.out.println("6: "+result6);
        System.out.println("7: "+result7);
        System.out.println("8: "+result8+".");
        System.out.println("9: "+result9);
    }
}
