package Array;
import java.util.*;
public class Aso
{
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("ABc");
        list.add("1ABC");
        list.add("2ABC");

        ListIterator<String> iter = list.listIterator();
        while(iter.hasNext()){
            //if("A".equals(iter.next())){
            {
                String s = iter.next();
                System.out.println("Remove value of s "+s);
                iter.remove();
                System.out.println(list);
               // System.out.println(" value of s "+s);

//                System.out.println(s);
            }
        }
//        collection.sort(list);
        System.out.println(list);

        System.out.println(list);

    }

}

