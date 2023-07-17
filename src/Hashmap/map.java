package Hashmap;

import java.util.*;

public class map
{
    public static void main(String[] args) {
        Map<String,String> map = new HashMap();
        map.put("akash ","Biradar");
        map.put("shubham","barude");
        map.put("omkar","bijjamwar");
        map.put("saurabh","patil");
        map.put("nikhil","Birjdar");
        map.put("ram","Rajaa");
        map.put("sony","tv");
        map.put("Test","match");
        map.put("csk","ipl");
        map.put("mumbai","capital");

        System.out.println("kays :"+map.keySet());
        System.out.println("values :"+map.values());


        List list = new LinkedList(map.keySet());
//        list.add(map.keySet());
//        list.add(map.values());
        List list1 = new LinkedList(map.values());

      // System.out.println("new list is "+list);

        Collections.sort(list);
        System.out.println("sort keys :"+list);

        Collections.sort(list1);
        System.out.println("sort values :"+list1);

 //LinkedHashSet
        //LinkedHashMap
        //Map
        // LinkedList
       // Set


//         Collections.sort(list);
//        System.out.println(list);
//
//        System.out.println(list);
//      Set<String> list1 = map.keySet();
//      list1.stream();
//        System.out.println("sorting kay:"+list1);
    }
}
