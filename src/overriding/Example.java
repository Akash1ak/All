package overriding;

class Vehicle{

// here we create a method as vehicle has engine

// but changing the output as vehicle engine

    void engine(){

        System.out.println("this is vehicle engine");

    }

}

// here we declare child class

// bike is based on vehicle category so its a child class

// we use extends keyword to call parent class

class Bike extends Vehicle{

// here we create method as same as in parent class

// but changing the output as bike engine

    void engine(){

        System.out.println ("this is bike engine");

    }

}

// here we declare child class

// car is based on vehicle category so it's a child class

class Car extends Vehicle{

// here we create method as same as in parent class

// but changing the output as car engine

    void engine(){

        System.out.println ("this is car engine");

    }

}

public class Example {

    public static void main(String[] arg) {

// here we create object for bike

        Bike honda = new Bike ();

        honda.engine();// calling engine method

// here we create object for car

        Car benz = new Car ();

        benz.engine ();  //calling engine method

    }

}
