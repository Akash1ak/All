package methodOverloading;

public class Ram
{
    int method1(int a)
    {
        System.out.println("this is method1");
        return 12;
    }
    int method1(int c,int b)
    {
        return 12+56;
    }
    String method1(String a,String b)
    {
        return "akee";
    }
    long method1(int a,int g,String j)
    {
        return 12+7;
    }
    int method2(int a)
    {
        return 78;
    }
    int method2(String s,long l)
    {
        return 23333;
    }
    long method2(int x,int y,String z)
    {
        return 56900;
    }
    String method2(int k,long y,String b)
    {
        return "dhoom";
    }

    public static void main(String[] args)
    {
        Ram ram = new Ram();
        ram.method1(12);
        System.out.println("values= "+ram.method1(12));
    }
}
