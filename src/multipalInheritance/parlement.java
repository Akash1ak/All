package multipalInheritance;

public class parlement
{
    void total()
    {
        System.out.println("in parlement tatal = 280");
    }
}
class bjp extends parlement
{
    void m1()
    {
        System.out.println("bjp 105");
    }
}
class shivsena extends bjp{
    void m2()
    {
        System.out.println("shivsena = 40, other =17");
    }
}
class congress extends shivsena
{
    void m3()
    {
        System.out.println("indian national congress 45 total ");
    }
}
class ncp extends congress
{
    void m4()
    {
        System.out.println("ncp 53");
    }
}
class total extends ncp
{
    public static void main(String[] args)
    {
        total tl = new total();
        tl.m1();
        tl.m2();
        tl.total();
        tl.m3();
        tl.m4();
    }
}