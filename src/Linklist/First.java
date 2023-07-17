package Linklist;

import java.util.LinkedList;
import java.util.List;
public class First
{
    public static void main(String[] args) {
        List <Integer>obj = new LinkedList<>();
        obj.add(122);
        obj.add(45);
        obj.add(2,98);
        System.out.println("list :"+obj);
        System.out.println(obj.remove(2));
        System.out.println(obj);
    }
}
