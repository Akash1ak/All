package part;

public class upcasting
{
    void m1()
    {
        System.out.println("this is a method 1");
    }
    void m2()
    {
        System.out.println("this is a method 2");
    }
}
class up extends upcasting
{
    @Override
    void m1() {                                          //overriding then he calls both methods
        System.out.println("this is m1.2");
        super.m1();
    }

    void m3()
    {
        System.out.println("this is third method");
    }
    void m4()
    {
        System.out.println("this is a fourth method");
    }

    public static void main(String[] args) {
        upcasting p = new up();
        p.m1();
        p.m2();
    }
}

