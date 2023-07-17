package Array;


import java.util.ArrayList;
import java.util.List;

public class abf
{
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add(765);
        list.add("Akash");
        list.add(856);
        list.add(90);
        list.add(678);
        list.add("rohen");
        list.add(856);
        list.add(2,54);
//        if(list.size()>1)
//        {
//            System.out.println("akash");
//        }
        System.out.println(list);


        List lo =new ArrayList();
        lo.add(90);
       lo.add("akash");
        lo.add(78);
        lo.add(90);
        List lo2 = new ArrayList();
        lo2.add(90);
        lo2.add(78);
        lo2.add(90);
        lo2.add(98);
       // lo2.removeAll(lo);
        System.out.println("Remove all="+lo2.removeAll(lo));
        lo2.retainAll(lo);
        System.out.println(lo2.indexOf(3));

        System.out.println( "retain =" +lo2);
        System.out.println( lo2.isEmpty());
//        lo2.remove(2);
//        System.out.println(lo2);
       // lo2.equall(lo);
        //        System.out.println("addall="+lo2);
        //       //.contas(lo);
        System.out.println( lo2.equals(lo));

      ///  lo2.addAlins(90);
        System.out.println("contains = "+lo2.contains(90));


        System.out.println(lo);
     //   lo2.clear();
      //  System.out.println(lo2);
        System.out.println(lo.equals(lo2));





//        System.out.println(list.get(1));
//        System.out.println(list.size());
//        System.out.println(list.remove(3));
//        System.out.println(list.contains("obj")); //false
System.out.println(lo.equals(lo2));
//        System.out.println(list);
    }
}
