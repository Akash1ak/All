class A
{
    private void m1()
    {
        System.out.println("pri");
    }
    private void m1(int a)
    {
        System.out.println("pri2");
    }
}
class B extends A{
    protected void m1()
    {
        System.out.println("one");
    }
}
class Test
{
    public static void main(String[] args) {
        B b =new B();
        b.m1();
    }
}
