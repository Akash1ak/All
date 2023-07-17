public class Laptop
{
    String company;
    int price;
    String rom;
    String display;
    public void m1(String company)
    {
        System.out.println("my new lapi "+company);
    }
    public void m2(int price)
    {
        System.out.println(+ price+" very high ");
    }
    public String quality(String display)
    {
        return " amold ";
    }

    public static void main(String[] args)
    {
        Laptop laptop =new Laptop();
        laptop.m1("hp");
        laptop.m2(67000);
        String ab=laptop.quality("amold");
        System.out.println("display is "+ab);
        System.out.println("===================================================================");
        Laptop lp =new Laptop();
        lp.m1("Dell");
        lp.m2(75000);
        String ob = lp.quality("normal");
        System.out.println("display is "+ob );
        System.out.println("===================================================================");
        Laptop lpt =new Laptop();
        lpt.m1("Apple");
        lpt.m2(120000);
        String ok = lpt.quality("full Hd");
        System.out.println("display is "+ok);
    }
}
