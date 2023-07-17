

public class watch
{
    public void m1()
    {
        String h ="watch shows time";
        System.out.println(" "+h);
    }
    public void m2()
    {
        String g =" time shoes people behaviour";
        System.out.println(" "+g);
    }
    public String m3(String a ,String b)
    {
      return a+b;
    }
}
class people extends watch
{
    public static void main(String[] args) {
        people p =new people();
        p.m1();
        p.m2();
      String result =  p.m3("bad " ,"time ");
      String r=result +" so use carefully";
        System.out.println(result +"shows money importance ");
        System.out.println(r);
    }
}
