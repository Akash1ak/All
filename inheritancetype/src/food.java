public class food
{
    public void ingredent()
    {
        String s = "chiken";
        System.out.println("first wash the "+s);
    }
}
class fire extends food
{
    String d= "Spicy chilly";
    int r =10;
    byte y = 5;
    public void making()
    {
        System.out.println("used some "+d+ " and salt "+r+ " gm and termarica "+y);
    }
}
class serve extends fire
{
   String e ="plate";
   public void serveing()
   {
       System.out.println("ok serve the chicken in "+e);
   }

    public static void main(String[] args) {
        serve se =new serve();
        se.ingredent();
        se.making();
        se.serveing();
    }
}

