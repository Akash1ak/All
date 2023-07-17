public class test2
{
    int a=19;

    static String b="ok google";
    static float f =0.00f;

    public static String getB() {
        return b;
    }

    public static void setB(String b) {
        test2.b = b;
    }

    public static float getF() {
        return f;
    }

    public static void setF()
    {
        test2.f = 0.009f;
        System.out.println(f);
    }

    public void m2()
    {
        char c='s';
        System.out.println("values are "+c +" "+f);

    }
    public void m7()
    {
       String r ="Rahul";
       String y ="panda";
       System.out.println("name is "+r +" "+y);
    }
    public void bank(String a)
    {
        int acno =9474;
        String name="HDFC BANK";
        Double ifsc =0012d;
        float vm = 985.9f;
        System.out.println("bank name is "+name);

    }
    public static void main(String [] args)
    {
       test2 ok =new test2();
       ok.m7();
       ok.bank("shubham");
       ok.setB("rada");
       ok.setF();

       System.out.println(ok.getB());
    }
}
