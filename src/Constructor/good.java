package Constructor;

public class good
{
    good()
    {
        System.out.println("this is def");
    }
    good(int a,double f)
    {
        System.out.println("this is paramete");
    }

    public static void main(String[] args) {
        good good =new good(12,8.9d);
        //good bo =new good();
    }
}
