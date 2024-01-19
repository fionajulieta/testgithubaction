package youtube.constructors27;

public class Human27 {
     /* constructors format is as below:
          ClassName(parameters) {
            arguments
          }
     */

    String name;
    int age;
    double weight;

    // use constructors to construct object with different value/attributes
    Human27 (String name,int age,double weight){

        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // how to access an object attributes from within it's class itself (use method)
    void eat() {
        System.out.println(this.name+" is eating");
    }
    void drink() {
        System.out.println(this.name+" is drinking *burp*");
    }
}
