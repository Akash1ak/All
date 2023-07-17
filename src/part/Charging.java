package part;

public interface Charging
{

    static void m1 ()
    {
        System.out.println("this is static method charging interface");
    }
    void m4();
}
interface Charge extends Charging
{
    static void m2()
    {
        System.out.println("this is static method in interface charge");
    }
}
abstract class Battery implements Charging ,Charge
{
    abstract void m3();
    static
    {
        System.out.println("this is static block");
    }
}

class Aooo extends Battery implements Charging,Charge
{
    @Override
    void m3() {
        System.out.println("this is abstract method implementation");
    }
    @Override
    public void m4()
    {
        System.out.println("this is m4 method implementation");
    }

    public static void main(String[] args) {
        Aooo aooo =new Aooo();
        aooo.m3();
        aooo.m4();
        Charging.m1();
        Charge.m2();
    }
}
