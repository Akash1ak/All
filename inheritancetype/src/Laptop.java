public class Laptop
{
    String m1()
    {
       return "Dell";
    }
}
class Screen extends Laptop
{
    String m2()
    {
        return "amold";
    }
}
class Keypad extends Screen
{
    String m3()
    {
        return "iball";
    }
}
class Feachers extends Screen
{
    String m4()
    {
        return "fingerprint lock";
    }
}
class Lapi extends Feachers
{
    public static void main(String[] args) {
        Lapi l = new Lapi();
        System.out.println(l.m1());
        System.out.println(l.m2());
        System.out.println(l.m4());
        Keypad k = new Keypad();
        System.out.println(k.m3());

    }
}