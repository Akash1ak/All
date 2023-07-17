package Array;

import java.util.ArrayList;

public class cust2
{
    public static void main(String[] args) {
       // custArray obj = new custArray();
        ArrayList <custArray> obj1 =new ArrayList<custArray>();
        obj1.add(new custArray(23,"saurabh"));
        obj1.add(new custArray(24,"omkar"));
//        obj.sub(12,"shubham");
//        obj.sub(13,"saurabh");
        System.out.println(obj1);
       // obj.(new custArray(03,"saurabh"));
    }
}
