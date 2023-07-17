public class unary {
    int v=100;
    int y=50;
    int z=30;
    boolean res=true;
    public void  ak()
    {
        boolean res1=((y+z)!=(v-y));
        System.out.println("enter cond:"+res1);
    }
    public void bk()
    {
        boolean res2=((z>y)==(y<z));
        System.out.println("enter cond:"+res2);
    }
    public static void main(String args[])
    {
        unary obj=new unary();
        obj.ak();
        obj.bk();
    }
}