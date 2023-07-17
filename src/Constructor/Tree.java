package Constructor;

public class Tree
{
    Tree(int a,String b,double c)
    {
        //this();
        System.out.println("this is 3A parameterised method/constructor");
    }
    Tree(int e,String f)
    {
        this(12);
       System.out.println("this is 2A parameterised method");
    }
    Tree(int g)
    {
        this(76,"akee",7.9);
        System.out.println("this is 1A para");
    }
}
class plant extends Tree
{
    plant()
    {
        super(12,"love");
        System.out.println("this is 3B parameterised method/constructor");
    }
    plant(int s,String v)
    {
        this();
        System.out.println("this is 2B parameterised method/constructor");
    }
    plant(int m,boolean k,double l)
    {
        this(10,"jk");
        System.out.println("this is 1B parameterised method/constructor");
    }

    public static void main(String[] args) {
        plant pe =new plant();

    }
}

