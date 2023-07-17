package ArrayList;

import java.util.ArrayList;

public class isempty
{
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        boolean result = num.isEmpty();
        System.out.println("arraylist :"+result);

        num.add(9);
        System.out.println("arraylist :"+num);
        result = num.isEmpty();                          //insertion deletion linklist  --->  //itteration sathi arraylist
        System.out.println("new result :"+result);
    }
}
