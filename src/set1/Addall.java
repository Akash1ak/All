package set1;

import java.util.LinkedHashSet;
import java.util.Set;

public class Addall
{
    public static void main(String[] args) {

            Set<Integer> ok = new LinkedHashSet<Integer>(); //set dosent contain duplicate value
            ok.add(44);
            ok.add(48);
            ok.add(46);
            ok.add(42);
            ok.add(74);
            ok.add(84);
            ok.add(94);
            ok.add(14);

            Set<Integer> ok1 = new LinkedHashSet<Integer>();
            ok1.add(87);
            ok1.add(88);
            ok1.add(73);
            ok1.add(66);
            ok1.add(74);
            ok1.add(22);
            ok1.add(77);
            ok1.add(14);

            ok.addAll(ok1);
        System.out.println("new list is :"+ok);
    }
}
