package ArrayList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class test
{
    public static void main(String[] args) {
        List abcd = new LinkedList();
        abcd.add("akash");
        abcd.add("shubham");
        abcd.add(4);

        Collections.sort(abcd);
        System.out.println(abcd);
    }
}
