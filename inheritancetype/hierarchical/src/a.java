public class a
{
    int a =100;
    int b =20;
    public void addition()
    {
        int c =a+b;
        System.out.println("Addition is "+c);
    }
}
class b extends a
{
    public void sub()
    {
       int  d =a-b;
        System.out.println("substraction is "+d);
    }
}
class c extends a
{
    public void mul()
    {
       int e = a*b;
       System.out.println("multiplication is = "+e);
    }
}
class d extends a
{
    int f = a/b;
    public void div()
    {
        System.out.println("division is "+f);
    }

    public static void main(String[] args) {
        d k =new d();
        k.addition();
        b obj=new b();
        obj.sub();
        c l =new c();
        l.mul();
        d ok =new d();
        ok.div();
    }
}
