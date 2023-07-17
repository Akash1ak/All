package Streamprac;

import java.util.*;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();   // <>  known as generic
        name.add("Akash");
        name.add("Angakd");
        name.add("Shubham");
        name.add("Saurabh");
        name.add("Vijaly");
        name.add("Ashish");
        name.add("Aman");


//              name.stream().sorted().forEach(System.out::println); //sorting
//              name.stream().distinct().forEach(System.out::println); //unique element
//              name.stream().forEach(System.out::println); //print
//              name.stream().limit(4).forEach(System.out::println); // take the list upto 4 element
//              name.stream().skip(2).forEach(System.out::println); //skip first 2 element            List<String> names = new ArrayList<>();
//              name.stream().map(String::length).forEach(System.out::println);  //character length
//              name.stream().sorted((String names1,String names2) -> names1.length() - names2.length()).forEach(System.out::println); //length Sorting
//              long ok = name.stream().filter((String ref) -> ref.length() > 5).count();
//        System.out.println("count function greater than 5 is "+ok);    // count

//        List<String> oksir = name.stream().limit(3).collect(Collectors.toList());
//        System.out.println(oksir);

//            names.stream().filter((String name) -> name.length() > 5).skip(1).forEach(System.out::println);
//
////Parallel Execution
//
//            names.parallelStream().filter((String name) -> name.length() > 5).skip(1).forEach(System.out::println);
//
//      OptionalInt jj = Arrays.stream(new int[] {40,50,90,41,22,33}).min();
//        System.out.println(jj);
//
//       OptionalInt jj1 = Arrays.stream(new int[] {40,50,90,41,22,33}).max();
//        System.out.println(jj1);

//       long count = name.stream().count();
//       System.out.println(count);

      /*  if(name.stream().anyMatch((String list) -> list.length() == 5)){
            System.out.println("True");}
            else
        {
            System.out.println("false");

        }*/

//        if(name.stream().allMatch((String ok) -> ok.length() == 5)){
//            System.out.println("true");
////        }

//        if(name.stream().allMatch((String list) -> list.length() == 5)){
//            System.out.println("True");}
//        else
//        {
//            System.out.println("false");

  /*      if (name.stream().noneMatch((String kk) -> kk.length() == 5)) {
            System.out.println("True");
        } else {
            System.out.println("false");
        }*/

//    Optional<String> firstelement = Stream.of("akash","okk","bjp","omkar","viru").findFirst();
//        System.out.println("this method recall a first element "+firstelement);

//        Optional <Integer> findany = Stream.of(55,66,77,99,22,66).findAny();
//        System.out.println("this method reall random any value "+findany);

      //  Stream.of(44,"Akash",444,44.5,"ok").forEach(System.out::println); //foreach method using print

//        Object [] ok = name.stream().toArray();
//        System.out.println("first convert  into string to array then print "+Arrays.toString(ok));

//        name.stream().filter((String ok)->ok.length()>5).peek(obj1 -> System.out.println("filter element:"+obj1)).
//        map(String::length).peek(obj5 -> System.out.println("mapping:"+obj5)).toArray();

        name.stream().filter(names -> names.length() < 5).
                map(String::toUpperCase).peek(obj2 -> System.out.println("mapping "+obj2)).forEach(System.out::println);
        }
}

