package Linklist;

import java.util.LinkedList;
import java.util.List;

public class  Secound
{
    public static void main(String[] args) {
        List<String> obj = new LinkedList<String>();
        obj.add("45");
        obj.add("Akash");
        obj.add("88");

        List<String> collection = new LinkedList<String>();
        collection.add("pune");
        collection.add("mumbai");
        collection.add("nashik");
        collection.add("goa");



        System.out.println(obj);
        System.out.println(collection);



        System.out.println(obj.addAll(1,collection)); //add from index //boolean
        System.out.println(obj);                            // add from index
//        System.out.println("add both list :"+obj.addAll(collection)); //boolean
//        System.out.println("new list :"+obj);
    }
}
