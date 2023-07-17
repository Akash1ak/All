package String;

import java.util.Set;

public class google {
    public static void main(String[] args) {
        String a ="google";
        String b = "hightech";
        a=a+b;
//        b=a.substring(0,4);
//        a=a.substring(4);
//        System.out.println("after swapping value :"+a+" "+b);
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println("Enter a values :"+a +" "+b);
    }
}
