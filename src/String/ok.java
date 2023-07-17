package String;

public class ok
{
    static int a;
    ok(int a)
    {

        System.out.println(a);
    }
    static
    {
        a=20;
       // System.out.println(a);
    }
    {
        System.out.println(a);
    }

    public static void main(String[] args) {
        ok ok =new ok(10);

    }
}
