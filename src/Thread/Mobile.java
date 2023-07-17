package Thread;

public class Mobile implements Runnable
{

    @Override
    public void run() {
        synchronized (this)
        {
            for(int i = 0;i<5;i++)
            {
                System.out.println("the thread name is "+ i + "thread "+Thread.currentThread().getName());
                System.out.println();
            }
        }
        System.out.println(Thread.activeCount());
    }

    public static void main(String[] args) {
        Mobile mo = new Mobile();
        Thread y = new Thread(mo);
        y.start();
        y.setName("akash");
        Thread o = new Thread(mo);
        o.start();
        o.setName("omkar");
    }
}
