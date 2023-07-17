public class Test1
{
     static int a=19;
     static int b=20;
    public void m0()
    {
        int c=a+b;
        System.out.println("add" +c);
    }
}
class Operation extends Test1
{
    public void m1()
    {
        System.out.println("sub =" + (a-b) );
    }
}
class Cal extends Operation
{
    public void m2()
    {
        System.out.println("div" +(a/b));
    }
}
class Hisab extends Operation
{
    public void m3()
    {
        System.out.println("mul" +(a*b));
    }
}
class Okdone extends Hisab
{
    public static void main(String[] args) {
        Okdone ok = new Okdone();
        ok.m0();
        ok.m1();
        ok.m3();
        Cal ok2 = new Cal();
        ok2.m2();
    }
}