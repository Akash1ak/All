package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class ram
{
    public static void main(String[] args) {
        Map<String,Integer> ok = new HashMap();
        ok.put("akash",5);
        ok.put("som",8);
        ok.put("son",8);
        ok.put("rsaa",88);

        String f =new String("java");
        String f1 = "java"; //scp
        String ss = f.concat(f1);
        System.out.println(ss);

        System.out.println(f.hashCode());
        System.out.println(f1.hashCode());




        System.out.println(ok);

        System.out.println( ok.get("akash"));

        System.out.println(ok.hashCode());

    }
}
