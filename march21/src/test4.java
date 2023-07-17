public class test4
{
    public void mix(int a,boolean b,char c,double d,float f)
    {
        System.out.println("print "+ a +" akash "+ b +" "+c);

    }
    public void om(int v)
    {
        System.out.println("onkar is my best friend and his salary is "+v);
    }
    public void in(String d)
    {
        System.out.println("value of a="+d);
    }
    public static void main(String [] args)
    {
        test4 ok =new test4();
        ok.mix(10,true,'a',23.9,83.9f);
        ok.om(70000);
        ok.in("A");
    }
}

