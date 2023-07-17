package part;

public class Come
{
    Come()
    {
        System.out.println("this is default constructor in Come class");
    }
    Come(int a,String b)
    {
        this();
        System.out.println("this is 2 parameterised constructor class come");
    }
    Come(int c,boolean d,String e)
    {
        this(18,"shubham");
        System.out.println("this is 3 parameterised constructor class Come");
    }
}
class Home extends Come
{
    Home()
    {
        super(12,true,"akee");
        System.out.println("this is default constructor class Home");
    }
    Home(int f,String g)
    {
        this();
        System.out.println("this is a two parameterised constructor of 2 class");
    }
    Home(String h,boolean k,int l)
    {
        this(89,"ok done");
        System.out.println("this is a three parameterised constructor of 2 class");
    }

}
class Dome extends Home
{
    Dome()
    {
        super("onkar",true,89);
        System.out.println("tjis is  constructor");
    }
    Dome(int z)
    {
       this();
        System.out.println("this is parameter constructor  hfhbtrfjtfrbtg j");
    }

    void m1()
    {
        System.out.println("this is a normal method");
    }

    public static void main(String[] args) {
        Dome dome =new Dome();
        dome.m1();
    }
}
