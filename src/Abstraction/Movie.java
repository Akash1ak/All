package Abstraction;

abstract class Movie
{
    abstract void set();
}
abstract class raone
{
    abstract void Retake();
    void set(boolean a)
    {
        System.out.println("the raoan set is so expensive it is " +a);
    }
}
class threller extends raone
{
    void Retake()
    {
        System.out.println("srk not taking retake bcz its perfect to taking shot");
    }
}
class superhit extends threller
{
    public static void main(String[] args)
    {
      threller th =new threller() ;
      th.Retake();
      th.set(true);
    }
}