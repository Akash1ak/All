public class sub
{
    public boolean m1(boolean v)
    {
        System.out.println("sure");
        return v;
    }
    public int m2()
    {
        int a=20;
        int c=10;
        int b=a-c;
        return b;
    }

}
class sun1 extends sub
{
    public static void main(String[] args) {
        sun1 bn =new sun1();
        bn.m2();
        bn.m1(true);
        System.out.println("values are "+bn.m2());

    }
}
