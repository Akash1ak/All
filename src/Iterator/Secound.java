package Iterator;

import java.util.*;

public class Secound {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(12);
        number.add(45);
        number.add(78);
        number.add(9);

        Iterator<Integer> it = number.iterator();  //iterator two type external or internal external for loop
        while (it.hasNext()) {
            Integer i = it.next();
            if (i < 10) {
                it.remove();
            }
        }
        System.out.println(number);
    }
}
