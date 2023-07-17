package Thread;

public class mt1thtrad extends Thread
{
    public void run()
    {

        for(int i =1;i<=5;i++)
        {
            System.out.println("Count is "+ i + "thread name is "+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Thread th = new Thread();
        th.start();
        th.setName("thread 2");
        System.out.println(th);
        mt1thtrad mt2 = new mt1thtrad();
        mt2.setName("ok");


    }
}
