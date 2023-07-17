public class test1
{
    int a=10;
    static int b=20;
    public void su()
    {
        int a=29;
        int b=90;
        System.out.println("value "+b);
    }
    public static void main(String[] args)
    {
        test1 ik =new test1();
        ik.su();
        int b=50;
        System.out.println("print static value "+b);
    }

}
