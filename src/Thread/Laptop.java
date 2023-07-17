package Thread;

public class Laptop implements Runnable {

    @Override
    public  void run() {
        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                System.out.println("the thread name is " + i + "thread " + Thread.currentThread().getName());
            }
//            try{
//                Thread.sleep(400);
//            }catch(Exception e){System.out.println(e);}
//        }
        }
    }
    public static void main(String[] args) {

        Laptop so = new Laptop();
        Thread t = new Thread(so);
        Thread t1 = new Thread(so);
        t.start();
        t.setName("rada");
        t1.start();
        t1.setName("kk");

//        Laptop s = new Laptop();
//        s.start();
//        s.setName("akee");
//        Laptop ss = new Laptop();
//        ss.start();
//        ss.setName("omee");

    }
}
