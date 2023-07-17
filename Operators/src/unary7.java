public class unary7 {
    int a=100;
    int b=50;
    boolean condition=true;
    public void ak()
    {
        boolean res=!(a<b);
        System.out.println("enter a condition:"+res);
    }
    public void bk()
    {
        int a =10;
        int b=20;
        int c= a+b;

        boolean res1=(a>b)==(a>b);
        System.out.println("enter a condition:"+res1);
    }

    public static void main(String args[])
    {
        unary7 obj1=new unary7();
        obj1.ak();
        obj1.bk();

    }
}