public class test3
{
    public void shoot(boolean a)
    {
        System.out.println("True is not equals to "+a);
    }
    public static void main(String [] args)
    {
        test3 ok = new test3();
        ok.shoot(true);
    }
}
