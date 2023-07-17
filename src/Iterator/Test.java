package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class  Test
{
    public static void main(String[] args) {
        ArrayList<Integer> ai = new ArrayList<Integer>();
        ai.add(45);
        ai.add(88);
        ai.add(78);
        ai.add(23);
        ai.add(22);
        System.out.println(ai);

//        for(int i =0;i<=ai.size();i++)
//        {
//            System.out.println(i);
//        }

        Iterator<Integer> i = ai.iterator(); //Iterator used only forword direction
        while (i.hasNext())
        {
            System.out.println(i.next());
        }

    }
}
