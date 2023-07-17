public class process
{
    int a=90;
    int b=20;
    public void m1()
    {

        int v =a+b;
        System.out.println("addition is = "+v);
    }
    public void m2()
    {
      int w = a-b;
      System.out.println("sub is = "+w);
    }
    public void m3()
    {
        int x =a*b;
        System.out.println("multiplication is = "+x);
    }
}
class micro extends process
{
    public static void main(String[] args) {
        process pe = new process();
        pe.m1();
        pe.m2();
        pe.m3();
    }
}

