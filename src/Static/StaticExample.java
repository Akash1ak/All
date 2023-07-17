package Static;
public class StaticExample {
    static int var1 = 10;  //static
    int var2 = 10;         //instance

    // We'll use this example to show how we can keep track of how many objects
    // of our class were created, by changing the shared staticInt variable
    /*public StaticExample() {
        //staticInt++;
        //normalInt++;
    }*/

    public static void main(String[] args) {
        // No instances of StaticExample have been created yet
        //System.out.println(StaticExample.staticInt); // Prints: 0
        //System.out.println(StaticExample.normalInt); // this won't work, obviously. As we have not created any instance of StaticExample

// Let's create two instances of StaticExample
        StaticExample object1 = new StaticExample();
        object1.var1 = 20;
        object1.var2 = 20;
        System.out.println("object1.var1 ttt "+object1.var1); // Prints:  20  10
        System.out.println("object1.var2 tttt "+object1.var2); // Prints: 20  20
// We can refer to static variables via an object reference as well,
// however this is not common practice, we usually access them via class name
// to make it obvious that a variable/method is static

        StaticExample object2 = new StaticExample();
        object2.var1 = 30;
        object2.var2 = 30;

        StaticExample object3 = new StaticExample();
        object3.var1 = 40;
        object3.var2 = 40;

        //  object1.var1 = 70;

        System.out.println("object1.var1 "+object1.var1); // Prints:  40     20
        System.out.println("object1.var2 "+object1.var2); // Prints:  20     20

        System.out.println("object2.var1 "+object2.var1); // Prints:  40     10
        System.out.println("object2.var2 "+object2.var2); // Prints:  30     30

        System.out.println("object3.var1 "+object3.var1); // Prints:   40    10
        System.out.println("object3.var2 "+object3.var2); // Prints:   40    40

        object1.var1 = 50;
        object1.var2 = 10;
        System.out.println(object2.var1); // Prints:
        System.out.println(object3.var1); // Prints:
        System.out.println(object2.var2); // Prints:
        System.out.println(object3.var2); // Prints:





       /* System.out.println(object1.staticInt); // Prints: 40
        System.out.println(object1.normalInt); // Prints: 20

        System.out.println(object2.staticInt); // Prints: 40
        System.out.println(object2.normalInt); // Prints: 30

        System.out.println(object3.staticInt); // Prints: 40
        System.out.println(object3.normalInt); // Prints: 40
*/
// We can see that increasing object2's staticInt
// increases it for object1 (and all current or future objects of that class)



    }

}
