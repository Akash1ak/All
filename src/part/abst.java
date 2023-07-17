package part;

abstract class abst
{
    abstract void m1();
}
abstract class abcd extends abst
{
    abstract void m2();
    void mk()
    {
        System.out.println("this is normel method in abstract class");
    }
}
class okaxis extends abcd
{
    @Override
    void m1()
    {
        System.out.println("this is m1 method implementation");
    }

    @Override
    void m2() {
        System.out.println("this is m2 method implmentation" +
                " abstract method imp");

    }

    public static void main(String[] args) {
        okaxis ab =new okaxis();
        ab.m1();
        ab.m2();
        ab.mk();
    }
}

