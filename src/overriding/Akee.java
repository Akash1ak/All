package overriding;

public class Akee
{
    int a =10;
    int b = 30;
    void add()
    {
        int c=a+b;
        System.out.println("this ia a method  ="+c);
    }
    void sub()
    {
        int d = b-a;
        System.out.println("sub ="+d);
    }
    void mul()
    {
        int e =a*b;
        System.out.println("mul = "+e);
    }
}
class Shubham extends Akee
{
//    void add()
//    {
//        int c=a+b+10;
//        System.out.println("this ia a method2  ="+c);
//    }

    @Override
    void add() {
        super.add();
    }

    void sub()
    {
        int d = b-a+7;
        System.out.println("sub2 ="+d);
    }
    void mul()
    {
        int e =a*b-8;
        System.out.println("mul2 = "+e);
    }

    public static void main(String[] args) {
        Shubham shu = new Shubham();
        shu.add();
        shu.mul();
        shu.sub();
    }
}
