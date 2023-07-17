package pack1;

public class A
{
    void m1() {
        System.out.println("m1 in class A");
    }
}
 class B extends A
{
    void m1() {
        super.m1();
        System.out.println("m1 in class B");
    }
}
 class C extends B
{
    void m1() {

        System.out.println("m1 in class C");
        super.m1();
    }
}
 class Test {
    public static void main(String[] args)
    {
        C c = new C();
        c.m1();
    }
}