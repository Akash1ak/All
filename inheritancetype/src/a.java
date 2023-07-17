public class a
{
    int a= 100;
    int b=8;
    public void m1()
    {
        int c=a+b;
        System.out.println("addition is ="+c);
    }
}
class b extends a
{
 public void m2()
 {
     int v= a-b;
     System.out.println("Sub is = "+v);
 }
}
class c extends b
{
    public void m3()
    {
        int n=a*b;
        System.out.println("mul ="+n);
    }
}
class d extends c
{
    public void m4()
    {
        int d=a/b;
        System.out.println("div is ="+d);
    }

    public static void main(String[] args)
    {
        d ok = new d();
        ok.m1();
        ok.m2();
        ok.m3();
        ok.m4();
    }
}

