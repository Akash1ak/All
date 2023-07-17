package set1;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Contains
{
    public static void main(String[] args) {
        Set<Integer> ok = new LinkedHashSet<Integer>();
        ok.add(44);
        ok.add(48);
        ok.add(46);
        ok.add(42);
        ok.add(74);
        ok.add(84);
        ok.add(94);
        ok.add(14);

        System.out.println("list :"+ok);
        System.out.println("48 is contain is checked :"+ok.contains(48));
        System.out.println("88 is contain os checked :"+ok.contains(88));

        Set<Integer> ok1 = new LinkedHashSet<Integer>();
        ok1.add(87);
        ok1.add(88);
        ok1.add(73);
        ok1.add(66);
        ok1.add(74);
        ok1.add(22);
        ok1.add(77);
        ok1.add(14);


        Set<Integer> ok2 = new LinkedHashSet<Integer>();
        ok2.add(44);
        ok2.add(48);
        ok2.add(46);
        ok2.add(42);
        ok2.add(74);
        ok2.add(84);
        ok2.add(94);
        ok2.add(14);

        System.out.println("cintain all list :"+ok.containsAll(ok1)); //true or false
        System.out.println("containall method :"+ok.containsAll(ok2));
        System.out.println("size is : "+ok.size());
        System.out.println("=======================================================");

        Iterator<Integer> i = ok2.iterator();
        while (i.hasNext())
        {
            System.out.println(+ i.next());
        }

    }
}
