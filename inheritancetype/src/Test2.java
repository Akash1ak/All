public class Test2
{
    public void m1()
    {
        System.out.println("Akash");
    }
}
class bombom extends Test2
{
    int a=6;
    int b=4;
    public void m2()
    {
        System.out.println("add ="+(a+b));
    }
}
class over extends bombom
{
    public String boundries(String c ,int d)
    {
        return "o";
    }
}
class sweet extends bombom
{
    public String over(String a,int b)
    {
        return "o";
    }
}
class mpl extends bombom
{
    public static void main(String[] args) {
        mpl ok =new mpl();
        ok.m1();
        ok.m2();
        sweet sw =new sweet();
        sw.over("over run",6);
        System.out.println("over are = "+sw.a+" "+sw.b+" ball");
        over bm = new over();
        bm.boundries("boundries run ", 4);




    }
}
