package methodOverloading;

public class Bullet
{
    void classic(int a)
    {
        System.out.println("cc"+a);
    }
    void classic(int b,String c)
    {
        System.out.println("classic "+c+ "price is "+b);
    }
    void classic (String s)
    {
        System.out.println("new varient"+s);
    }
}



//overloading means same methoname but parameter is different
