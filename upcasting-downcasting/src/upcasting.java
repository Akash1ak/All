public class upcasting
{
    public void m1()
    {
        int a=19;
        int b=98;
        int f =a+b;
        System.out.println("add ="+f);
    }
    void m2()
    {
        System.out.println("akee");
    }
}
class up extends upcasting
{
    @Override
    void m2() {
        System.out.println("bir");
        super.m2();
    }
    //    public void m2()
//    {
//        String s="ram";
//        System.out.println("String ="+s);
//    }

    public static void main(String[] args) {
        upcasting obj = new up();
        obj.m1();
        obj.m2();
        //obj.m2();---can not resolve upcasting 
    }
}
