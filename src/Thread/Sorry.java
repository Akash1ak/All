package Thread;

public class Sorry implements Runnable {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println("the thread name is " + i + "thread " + Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {

        Sorry so = new Sorry();
        Thread t =new Thread(so);
        t.start();
        t.setName("rada");

        Thread th = new Thread(so);
        th.start();
        th.setName("rom");

       // System.out.println(th);

    }
}
