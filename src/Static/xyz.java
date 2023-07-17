package Static;

public class xyz
{
    int a=10;
    static int b =10;
    xyz()
    {
        a++;
        b++;
        System.out.println("value of a "+a);
        System.out.println("value of b "+b);
    }

    public static void main(String[] args) {
        xyz xyz =new xyz();
        xyz xy =new xyz();
        xyz x =new xyz();
    }
}
