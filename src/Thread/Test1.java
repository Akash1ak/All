package Thread;

public class Test1 implements Runnable
{
    int a =10;
    int b=20;

    @Override
    public void run() {
        addition();
        substraction();
        multiplication();

    }
    void addition()
    {
        int sum = a+b;
        System.out.println("Sum is :"+sum);
    }
    void substraction()
    {
        int sub = b-a;
        System.out.println("substraction of two no :"+sub);
    }
    void multiplication()
    {
        int mul =a*b;
        System.out.println("multiplication is "+mul);
    }

    public static void main(String[] args) {
        System.out.println("main thread is running");
        Test1 test1 = new Test1();
        Thread t = new Thread(test1);
        t.start();
    }
}
