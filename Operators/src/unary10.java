public class unary10 {
    public void ak()
    {
        int a=20;
        int b=30;
        int c=a+b;
        boolean res=((a<c)==(b<c));
        System.out.println("enter cond:"+res);
    }
    public void bk()
    {
        int a=20;
        int b=30;
        int c=a+b;
        boolean res1=((a<c)!=(b<c));
        System.out.println("enter cond:"+res1);
    }
    public static void main(String args[])
    {
        unary10 obj=new unary10();
        obj.ak();
        obj.bk();
    }
}