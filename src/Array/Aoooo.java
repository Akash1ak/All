package Array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Aoooo {
    public static void main(String[] args) {
        List ok = new ArrayList();
        ok.add("54");
        ok.add("55");
        ok.add("88");
        ok.add("33");

//        for(Object e :ok)
//        {
//            System.out.println(e);
////        }
//        for (int i = 0; i < ok.size(); i++) {
//            System.out.println(ok.get(i));
//        }
//        ListIterator ii = ok.listIterator();
//        while(ii.hasNext()){
//            ii.add(5);    //fail safe is possible in only listIterator
//        //    ok.add(5);    //fail fast
//            System.out.println(ii.next());

        Iterator ii = ok.iterator();
        while(ii.hasNext()){
            ii.remove();
            System.out.println(ii.next());
//        ListIterator ii = ok.listIterator();
//        while (ii.hasNext()) {
//            if(ii.hasPrevious())
//            {
//                System.out.println("has pre"+ii.next());
//            }
        }
        System.out.println(ok);
    }
}



