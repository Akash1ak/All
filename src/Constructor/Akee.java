package Constructor;

 class size
{
    size()
    {
        System.out.println("this is default");
    }
    size(int a)
    {
        this();
        System.out.println("notebook price is "+a);
    }
    size(long b,boolean c)
    {
        this(150);
        System.out.println("distance of mumbai to pune is "+b +" is "+c);
    }
    size(short d,String e,String f)
    {
        this(150,true);
        System.out.println("size of  paint "+d + " and "+e +" size 3 "+f );
    }
}
class work extends size
{
    work()
    {
        super((short)32,"shoes","watch");
        System.out.println("this is default work");
    }
    work(int z)
    {
        this();
        System.out.println("time of work is "+z);
    }
    work(String x,boolean y)
    {
        this(8);
        System.out.println("using only "+x +"total work to be handeled it is "+y+" story od it");

    }
}
class Akee extends work
{
    Akee()
    {
        super("laptop",true);
        System.out.println("this is constructor");
    }
    void Akee()
    {
        System.out.println("this is a constructor method");
    }
    public static void main(String[] args)
    {
  Akee akee =new Akee();
  akee.Akee();
    }
}
