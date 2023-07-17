package Hashmap;

//import java.util.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class first
{
    public static void main(String[] args) {
        HashMap<Integer,String> ok = new HashMap<>();
        HashMap<Integer,String> ok1 = new HashMap<>();
        {
            ok.put(01,"akash");
            ok.put(02,"shubham");
            ok.put(03,"omkar");
            ok.put(04,"omkar");

            ok1.put(01,"mumbai");
            ok1.put(03,"pune");
            ok1.put(02,"nashik");

            Set<Integer> keyset =  ok1.keySet();
            keyset.stream();
            System.out.println("ketset :"+keyset);

            Collection<String> values = ok1.values();
            System.out.println("values :"+values);

            Set< Map.Entry <Integer,String>> entrySet = ok1.entrySet();
            System.out.println("entry set ok secound hash :"+entrySet);

            System.out.println(ok1.get(03));
            System.out.println("map is : "+ok);
            System.out.println("2 ns map is : "+ok1);
            System.out.println("equals :"+ok.equals(ok1));
            System.out.println("map size is :"+ok.size());
            ok.remove(02);
            System.out.println("map size is :"+ok.size());
            ok1.clear();
            System.out.println("after a clear :"+ok1);
            boolean done = ok.isEmpty();
            System.out.println("is empty method :"+done);

        }
    }
}
