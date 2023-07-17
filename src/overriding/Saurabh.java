package overriding;

public class Saurabh
{
    int i=10;
    int b=20;

    void add()
    {
        int c =i+b;
        System.out.println(c);
    }
    void sub()
    {
        int d =b-i;
        System.out.println(d);
    }
    void mul()
    {
        int e =i*b;
        System.out.println(e);
    }
}
class chinu extends Saurabh
{


    void add() {
       // super.add();
        int c =i+b+10;
        System.out.println(c);
    }

    void sub() {
        int d = b-i-2;
        System.out.println(d);
    }

    public static void main(String[] args) {
        chinu ch = new chinu();
        ch.add();
        ch.sub();
    }
}
