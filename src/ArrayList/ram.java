package ArrayList;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


 public class ram
{
    public static void main(String[] args) {
        Set ok = new LinkedHashSet();  // linkedhashset followas insertation order
        ok.add(44);
        ok.add(43);
        ok.add(48);
        ok.add(4);
        ok.add(48);
        ok.add(47);
        System.out.println(ok);

        System.out.println(ok.size());
        System.out.println(ok.hashCode());
        System.out.println(ok.contains(4));

//        ok.removeAll(ok);
//        System.out.println(ok);

        //int ref = ok.toArray();
        System.out.println(ok.toArray());  //hashcode

    }
}
