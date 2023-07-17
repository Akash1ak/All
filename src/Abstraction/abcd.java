package Abstraction;

abstract class abcd
{
    abstract void engin();
}
abstract class xyz extends abcd
{
    abstract void run();
}
class dhoom extends xyz
{
    @Override
    void engin()
    {
        System.out.println("this is car engin");

    }

    @Override
    void run()
    {
        System.out.println("press acclerate then run the car");

    }

    public static void main(String[] args)
    {
        dhoom dhoom =new dhoom();
        dhoom.engin();
        dhoom.run();
    }
}
