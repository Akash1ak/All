package inheritance;

public class ooook {
    public void m1()
    {
        System.out.println("oj");
    }
}
class abs
{
    void m2()
    {
        System.out.println("ooook");
    }
    public static void main(String[] args)
    {
    ooook ok = new ooook();
    ok.m1();
        abs av =new abs();
        av.m2();
}
}