package part;

public class overriding
{
    void method()
    {
        System.out.println("this is a method1");
    }
    void method2()
    {
        System.out.println("this is method2");
    }
    static
    {
        System.out.println("this is a static block");
    }
    overriding()
    {
        System.out.println("this is a constructor");
    }
    {
        System.out.println("this is a iib");
    }
    static void method3()
    {
        System.out.println("this is a static method");
    }
}
class ak extends overriding
{
    @Override
    void method() {
        System.out.println("this ia a method of xyz");
        super.method();
    }

    @Override
    void method2() {
        System.out.println("this is a method2 of xyz ");
        super.method2();
    }

    static
    {
        System.out.println("this is a static block of xyz");
    }

    static void method3()
    {
        System.out.println("this is a static method of xyz");
    }
    {
        System.out.println("this is a iib of xyz");
    }
    ak()
    {
        System.out.println("this is a constructor");
    }

    public static void main(String[] args) {
        ak ref = new ak();
        ref.method();
        ref.method2();
        overriding.method3();
        ak.method3();
    }
}
