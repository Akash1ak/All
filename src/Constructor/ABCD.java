package Constructor;

public class ABCD
{
    ABCD()
    {
        System.out.println("this is default constructor od class ABCD");
    }
    ABCD(int a,String b)
    {
        System.out.println("this is parmeterised constructor of class ABCD ");
    }
}
class alpha extends ABCD
{
    alpha()
    {
        System.out.println("this is default constructor od class alpha");
    }
    alpha(int c,String d)
    {
        System.out.println("this is parameterised constructor od class alpha");
    }
}
class order extends alpha
{
    order()
    {
        System.out.println("this is default constructor od class order");
    }
    order(int e,String f)
    {
        System.out.println("this is parameterised constructor od class order");
    }
}
class xyz
{
    public static void main(String[] args) {
        order od = new order();
       // order od1 = new order(1,"abc");
    }
}