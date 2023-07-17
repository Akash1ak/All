public class wash
{
    static String s = "cloth";
    public void m1()
    {
        System.out.println("washing "+ s + "is a one of the process");
    }

}
class clean extends wash{

    public void m2()
    {
        String f ="vim";
        System.out.println("clning vessels used"+f);
    }

}
class wiping extends clean{
    String s ="glass";
    public void m3()
    {
        System.out.println("wipes used to cleaning "+s);
    }

    public static void main(String[] args) {
        String s = "ok";
        wiping w =new wiping();
        w.m1();
        w.m2();
        w.m3();
        System.out.println("washing "+s);
    }
}
