package Iterator;

import org.w3c.dom.Node;

import java.util.*;

//public class Third {
//    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        {
//            list.add("akash");
//            list.add("8");
//            list.add(45);
//            list.add(78);
//            list.add("shubham");
//
//            System.out.println(list);
//            Iterator itr = list.iterator();
//            while
//            (itr.hasNext()) {
//              //  list.add(5);
//                System.out.println(itr.next());
//            }
//
//        }
//    }
//}
class Four {
    public static void main(String[] args) {
        List ok = new ArrayList<>();

            ok.add("okdone");
            ok.add(45);
            ok.add(87);


            ListIterator done = ok.listIterator();

//                while (done.hasNext()) {
//                    System.out.println(done.next());
//                }
                while (done.hasPrevious()) {
                    System.out.println(done.previous());
                }
//                done.set(55);
//                System.out.println(ok);
//                done.remove();
//                System.out.println(ok);

           

    }
}
