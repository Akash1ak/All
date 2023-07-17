package Thread;

public class Mythread extends Thread
{
    public void run()                // thread class method
    {
        System.out.println("new thread is running" );
    }
    public static void main(String[] args) {

        System.out.println("main thread is running");

        Mythread mt = new Mythread();

        Thread t = new Thread(mt);
        t.start();                     // thread class inbuilt methods
    }

}
