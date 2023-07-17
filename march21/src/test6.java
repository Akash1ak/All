public class test6
{
    public void met(boolean a,char d,String s)
        {
            System.out.println("this is a some value"+a+" "+d+" "+s);
        }
    public void met1(int k,double g,float x)
    {
        System.out.println("values "+k +" "+g);
    }
    public static void main(String [] args)
    {
        test6 ok =new test6();
        ok.met(true,'a',"akash");
        ok.met1(78,56.98,8.98f);

    }
}
