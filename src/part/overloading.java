package part;

public class overloading
{
    void m1(int a)
    {
        System.out.println("this is a method m1"); //same class diff parameter
    }
    void m1(int a,String b)
    {
        System.out.println("this is method1 two parameter");
    }
    void m1(int g,String n,boolean c)
    {
        System.out.println("this is method1 three parameter");
    }
    overloading()
    {
        System.out.println("this ia a constructor");
    }
    overloading(int a)
    {
        System.out.println("akee34");
    }
    static
    {
        System.out.println("this is a static block" );
    }
    static void m1()
    {
        System.out.println("this is a static method");
    }
    {
        System.out.println("this is iib");
    }

    public static void main(String[] args) {
        System.out.println("this is main");
        overloading over = new overloading();
        overloading ove = new overloading(87);
        over.m1(56);
        over.m1(67,"Akee");
        over.m1(54,"Biradar",true);
        overloading.m1();   //static method calling
    }
}
