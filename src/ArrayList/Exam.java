package ArrayList;

import java.util.ArrayList;

public class Exam
{
    public static void main(String[] args) {
        ArrayList ok = new ArrayList();
        ok.add("akash");
        ok.add("Ram");
        ok.add("kanchan");
        ok.add("sauruu");
        ok. add(4);
        ok.add("shruddha");
        ok.add(7);

        System.out.println(ok);
       // System.out.println(ok.get(4));

        System.out.println("hashcode :"+ok.hashCode());

        ArrayList ok1 = new ArrayList();
        ok1.add("akash");
        ok1.add("seeta");
        ok1.add("kanchan");
        ok1.add("sauruu");
        ok1. add(4);
        ok1.add("shraddha");
        ok1.add(9);
//        System.out.println(ok1);
//
//        ok.addAll(ok1);
//        System.out.println(ok);

//        ok.clear();
//        System.out.println("clear :"+ok);

//        System.out.println("contains :"+ok.contains(ok1));
//        System.out.println("Contains all :"+ok.containsAll(ok1));

//        ok.removeAll(ok1);
//        System.out.println("remove :"+ok);


     //   System.out.println(ok.size());
        System.out.println("clone :"+ok.clone());


      //  System.out.println("get element :"+ok.get(5));
       // System.out.println("index of "+ok.indexOf("sauruu"));


       // System.out.println(ok.isEmpty());
      //  System.out.println(ok.lastIndexOf("shruddha"));

        ok.retainAll(ok1);
        System.out.println(ok);




    }

}
