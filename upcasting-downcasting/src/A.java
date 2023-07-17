public class A
{
    int a=10;
    void m1()
    {
        System.out.println(a);
    }
}
class B extends A
{
    public static void main(String[] args) {
      //  B obj = (B) new A();

        A obj =new B(); //upcasting
        obj.m1();
    }
}
