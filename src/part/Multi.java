package part;

public class Multi
{
    void m1()
    {
        System.out.println("this is parent class");
    }
}
class Many extends Multi
{
    void m2()
    {
        System.out.println("this is child class 1");
    }
}
class More extends Many
{
    void m3()
    {
        System.out.println("this is child class 2");
    }

    public static void main(String[] args) {
        More more =new More();
        more.m1();
        more.m2();
        more.m3();
    }
}
