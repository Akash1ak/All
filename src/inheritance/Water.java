package inheritance;

public class Water {
    int a = 100;
    int b = 20;

    void formula() {
        System.out.println("formula is H2O");
    }
}

class Uses extends Water {
    public void m2() {
        int result = a + b;
        System.out.println("add = " + result);
    }
}

class Container extends Uses {

    public static void main(String[] args) {
        Container container = new Container();
        container.formula();
        container.m2();
    }
}
