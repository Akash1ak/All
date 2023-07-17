package ArrayList;

import java.util.ArrayList;

public class Secound {
    public static void main(String[] args) {
        ArrayList<String> animal = new ArrayList<>();
        animal.add("Dog");
        animal.add("Cat");
        animal.add("cow");
        animal.add("Horse");
        System.out.println("Arraylist :"+animal);

        String str = animal.get(2);
        System.out.println("element in 2 index :"+str);
    }
}
