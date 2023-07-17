public class test2
{
    int sum(int a ,int b)
    {
        int c=a+b;
        System.out.println("sum="+c);
        return 10;
    }
    String word()
    {
        System.out.println("raj");
        return "raj";
    }
    public static void main(String[] args)
    {
        test2 ok = new test2();
        ok.sum(18,6);
        ok.word();
    }
}
