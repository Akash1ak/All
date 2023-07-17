package ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class four
{
    public static void main(String[] args) {
        LinkedList<Integer> first = new LinkedList<>();
        first.add(1);
        first.add(2);
        first.add(3);
        first.add(6);
        System.out.println(first);
//        System.out.println(first.hashCode());
        first.set(1,5);
        System.out.println(first);
        first.add(3,8);
        System.out.println(first);
        //first.indexOf(6);
        System.out.println(first.indexOf(6));
        System.out.println(first.isEmpty());

//        System.out.println("sublist array:"+first.subList(0,2));
//        System.out.println("subset array2 :"+first.subList(2,first.size()));
//
          System.out.println("array list :"+first);
          System.out.println("return value of clone "+first.clone());
//
//        ArrayList<Integer> cloneno =(ArrayList<Integer>)first.clone();   //imp
//        System.out.println("clone Arraylist ="+cloneno);
    }
}
