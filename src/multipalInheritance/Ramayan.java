package multipalInheritance;

public class Ramayan {
    public void m1() {
        System.out.println("the greatest history of ancient india");
    }
}

class Ram extends Ramayan {
    public void m2() {
        System.out.println("Seeta husband");
    }

}

class Seeta extends Ram {
    public void m3() {
        System.out.println("Rams wife");
    }

}

class hanuman extends Seeta {

    public static void main(String[] args) {
        hanuman h1 = new hanuman();
        h1.m1();
        h1.m2();
        h1.m3();

    }
}



