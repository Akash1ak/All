package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class convertintString
{
    public static void main(String[] args) {
        List at = new LinkedList();
        at.add(4);
       at.add(Integer.parseInt("45"));
        at.add(5);
        at.add(8);
        at.add(7);
      // at.add("78");

        Collections.sort(at);
        System.out.println(at);
    }
}
