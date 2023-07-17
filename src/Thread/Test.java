package Thread;

public class Test extends Thread
{
    public void run()
    {
        for(int i =0;i<=5;i++)
        {
            System.out.println("Count is "+ i + "thread name is "+Thread.currentThread().getName());
        }
        Thread th = Thread.currentThread();
        System.out.println(th);
        System.out.println("New thread strats running");
        System.out.println("I am in run() method");
    }

    public static void main(String[] args) {
        System.out.println("main thread is start running");
        Thread th1 = Thread.currentThread();
        System.out.println(th1);

        int c1 = Thread.activeCount();
        System.out.println(c1);

        // Create an object of Test class.
        Test test = new Test();
        int c3 =Test.activeCount();
        System.out.println(c3);

        // Create an object of Thread class and pass the object reference variable test.
        Thread t = new Thread(test);
        int c4 =  Thread.activeCount();
        System.out.println(c4);

        // Now run thread on the object. For this, call start() method using reference variable t.
        t.start();
        int c5 = Thread.activeCount();
        System.out.println(c5);
        t.setName("new thread");
    }
}

