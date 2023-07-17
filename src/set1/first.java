package set1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class first {
    public static void main(String[] args) {
        Set<String> hash_set = new HashSet<>();
        hash_set.add("Akash");
        hash_set.add("ok");
        hash_set.add("45");
        hash_set.add("78");

        System.out.println(hash_set);

        Iterator<String> it = hash_set.iterator();

        while(it.hasNext())
        {
           // System.out.println(it.next());
            String ss = (String)it.next();
            System.out.println(ss);
        }
    }
}
