public class Bike
{
    public void m1()
    {
        System.out.println("Honda");
    }
}
class Twowheeler extends Bike
{
    public void m2()
    {
        System.out.println("hero");
    }
}
class Motarcycle extends Twowheeler
{
    public void m3()
    {
        System.out.println("tvs");
    }
}
class Cycle extends Twowheeler
{
    public void m4()
    {
        System.out.println("firefox");
    }
}
class Name extends Cycle
{
    public static void main(String[] args) {
        Name n =new Name();
        n.m1();
        n.m2();
        n.m4();
        Motarcycle m =new Motarcycle();
        m.m3();
    }
}