package part;

public class has
{
    public static void main(String[] args)
    {
        Akee a =new Akee();
        a.m1();
        a.m2();

    }
}
class Akee                      //has relation means no need to extend
{
    void m1()
    {
        System.out.println("ths is a method1");
    }
    void m2()
    {
        System.out.println("this is a method 2");
    }
}