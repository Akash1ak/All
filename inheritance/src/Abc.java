abstract class A
{
    abstract int add(int a , int b);
}

class B extends A
{


    @Override
    int add(int a, int b) {
        int sum=a+b;
        return sum;
    }
}

class C
{
    public static void main(String[] args )
    {
        B e = new B();
        System.out.println( e.add(1,2));
    }
}