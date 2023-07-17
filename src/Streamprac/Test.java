package Streamprac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test
{
    public static void main(String[] args) {
        List<String> aa = new ArrayList<String>();   // <>  known as generic
        aa.add("Akash");
        aa.add("Angad");
        aa.add("Shubham");
        aa.add("Saurabh");
        aa.add("Vijay");
        aa.add("Ashish");
        aa.add("Aman");
        String ok = "A";
//        for (int i = 1; i < aa.size(); i++)
//        {
//            if (aa.get(i).startsWith(ok.toUpperCase()));
//            {
//                aa.add(aa.get(i));
//            }
//        }
//        System.out.println(aa);
//        for (String aa1:aa) {
//            if(aa1.startsWith("A"))
//            {
//                System.out.println("print all records with A "+aa1);
//            }
//
//        }
       // aa.stream().filter(s -> s.startsWith("A")).forEach(System.out::println);

//        List<String> ok1 = aa.stream().filter(s->s.startsWith("A")).collect(Collectors.toList());
//        System.out.println(ok1);

        List<String> ok1 = aa.stream().
                filter(s->s.startsWith("A")).
                distinct().
                filter(s->s.startsWith("B")).
                distinct().
                sorted().
                collect(Collectors.toList());
        System.out.println(ok1);
        aa.stream().distinct().forEach(System.out::println);
    }
}
//        System.out.println(aa);
//
//        Collections.sort(aa);
//        System.out.println(aa);

