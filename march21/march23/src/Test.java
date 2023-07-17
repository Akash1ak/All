public class Test
{
    int a=10;
   static  boolean b=true;
   static String c="akee";


    public static boolean isB() {
        return b;
    }

    public static void setB(boolean b) {
        Test.b = b;
    }

    public static String getC() {
        return c;
    }

    public static void setC(String c) {
        Test.c = c;
    }

    public void m1()
    {
        int v = 89;
        System.out.println("values are"+v +" "+c);
        System.out.println("values are"+b);
    }
    public static void main(String [] args)
    {
        Test ok = new Test();
        ok.m1();
    }
}
